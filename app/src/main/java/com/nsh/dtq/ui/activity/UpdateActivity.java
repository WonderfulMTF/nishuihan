package com.nsh.dtq.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nsh.dtq.R;
import com.nsh.dtq.db.DBUtil;
import com.nsh.dtq.entity.ChoiceQuestion;

/**
 * Created by licong on 2018/8/2.
 */

public class UpdateActivity extends Activity{

    public final static String INSERT_TYPE_CHOICE = "choice";

    private EditText mEtQuestionXz, mEtAnswerA, mEtAnswerB, mEtAnswerC, mEtAnswerD;
    private Button mBtUptate;
    private String type = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        initView();
        initData();
        initThing();
    }

    private void initThing() {
        mBtUptate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals(INSERT_TYPE_CHOICE)){
                    long id = (long) mEtQuestionXz.getTag();
                    String question = mEtQuestionXz.getText().toString();
                    String a = mEtAnswerA.getText().toString();
                    String b = mEtAnswerB.getText().toString();
                    String c = mEtAnswerC.getText().toString();
                    String d = mEtAnswerD.getText().toString();
                    if (TextUtils.isEmpty(question)){
                        Toast.makeText(UpdateActivity.this, "问题项不能为空", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(a)){
                        Toast.makeText(UpdateActivity.this, "选项A（正确项）不能为空", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    ChoiceQuestion choiceQuestion = new ChoiceQuestion(id, question, a, b, c, d);
                    boolean isSuccess = DBUtil.uptateChoiceQuestion(choiceQuestion);
                    if (isSuccess){
                        Toast.makeText(UpdateActivity.this, "修改成功", Toast.LENGTH_SHORT).show();
                        UpdateActivity.this.finish();
                    }else {
                        Toast.makeText(UpdateActivity.this, "修改失败", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void initData() {
        setResult(101);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
        mEtQuestionXz.setText(intent.getStringExtra("question"));
        mEtQuestionXz.setSelection(mEtQuestionXz.getText().toString().length());
        mEtQuestionXz.setTag(intent.getLongExtra("id", -1L));
        mEtAnswerA.setText(intent.getStringExtra("a"));
        mEtAnswerB.setText(intent.getStringExtra("b"));
        mEtAnswerC.setText(intent.getStringExtra("c"));
        mEtAnswerD.setText(intent.getStringExtra("d"));
    }

    private void initView() {
        mEtQuestionXz = findViewById(R.id.et_update_choice_question);
        mEtAnswerA = findViewById(R.id.et_update_choice_answer_a);
        mEtAnswerB = findViewById(R.id.et_update_choice_answer_b);
        mEtAnswerC = findViewById(R.id.et_update_choice_answer_c);
        mEtAnswerD = findViewById(R.id.et_update_choice_answer_d);
        mBtUptate = findViewById(R.id.bt_update);
    }
}
