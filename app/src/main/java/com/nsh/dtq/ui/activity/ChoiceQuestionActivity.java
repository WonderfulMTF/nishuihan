package com.nsh.dtq.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.nsh.dtq.R;
import com.nsh.dtq.db.DBUtil;
import com.nsh.dtq.entity.ChoiceQuestion;
import com.nsh.dtq.ui.adapter.ChoiceQuestionListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by licong on 2018/8/2.
 */
public class ChoiceQuestionActivity extends Activity{

    private ListView mLv;
    private EditText mEtSearchQuestion, mEtSearchAnswer;
    private ImageView mIvSearchQuestionBtn, mIvSearchAnswerBtn;
    private Button mBtInsert;
    private LinearLayout mLlNoData;
    private List<ChoiceQuestion> mDataList = new ArrayList<>();
    private ChoiceQuestionListAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_question);
        initView();
        initData();
        initThing();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == 101){
            String str = TextUtils.isEmpty(mEtSearchQuestion.getText().toString()) ? "" : mEtSearchQuestion.getText().toString();
            queryData(str, DBUtil.CHOICE_QUESTION_TYPE);
        }
    }

    private void initThing() {
        mIvSearchQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = TextUtils.isEmpty(mEtSearchQuestion.getText().toString()) ? "" : mEtSearchQuestion.getText().toString();
                queryData(str, DBUtil.CHOICE_QUESTION_TYPE);
            }
        });

        mIvSearchAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = TextUtils.isEmpty(mEtSearchAnswer.getText().toString()) ? "" : mEtSearchAnswer.getText().toString();
                queryData(str, DBUtil.CHOICE_ANSWER_TYPE);
            }
        });

        mBtInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceQuestionActivity.this, InsertNewActivity.class);
                intent.putExtra("type", InsertNewActivity.INSERT_TYPE_CHOICE);
                ChoiceQuestionActivity.this.startActivityForResult(intent, 101);
            }
        });

        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                final String[] items = new String[] { "纠错修改", "删除此题" };
                AlertDialog.Builder builder = new AlertDialog.Builder(ChoiceQuestionActivity.this);
                builder.setTitle("请选择")
                        .setItems(items, new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which){
                                    case 0:
                                        Intent intent = new Intent(ChoiceQuestionActivity.this, UpdateActivity.class);
                                        intent.putExtra("type", UpdateActivity.INSERT_TYPE_CHOICE);
                                        intent.putExtra("id", mDataList.get(position).getId());
                                        intent.putExtra("question", mDataList.get(position).getQuestion());
                                        intent.putExtra("a", mDataList.get(position).getAnswerA());
                                        intent.putExtra("b", mDataList.get(position).getAnswerB());
                                        intent.putExtra("c", mDataList.get(position).getAnswerC());
                                        intent.putExtra("d", mDataList.get(position).getAnswerD());
                                        ChoiceQuestionActivity.this.startActivityForResult(intent, 101);
                                        break;
                                    case  1:
                                        //TODO 后期改造线程删除
                                        boolean isSuccess = DBUtil.deleteChoiceQuestion(mDataList.get(position));
                                        if (isSuccess){
                                            Toast.makeText(ChoiceQuestionActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
                                            queryData("", DBUtil.CHOICE_QUESTION_TYPE);
                                        }else {
                                            Toast.makeText(ChoiceQuestionActivity.this, "删除失败", Toast.LENGTH_SHORT).show();
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                builder.create().show();
            }
        });
    }

    private void initData() {
        queryData("", DBUtil.CHOICE_QUESTION_TYPE);
        mAdapter = new ChoiceQuestionListAdapter(ChoiceQuestionActivity.this, mDataList);
        mLv.setAdapter(mAdapter);
    }

    private void initView() {
        mLv = (ListView) findViewById(R.id.lv_xzt);
        mIvSearchQuestionBtn = (ImageView) findViewById(R.id.iv_search_xzt_question);
        mEtSearchQuestion = (EditText) findViewById(R.id.et_search_xzt_question);
        mIvSearchAnswerBtn = (ImageView) findViewById(R.id.iv_search_xzt_answer);
        mEtSearchAnswer = (EditText) findViewById(R.id.et_search_xzt_answer);
        mLlNoData = (LinearLayout) findViewById(R.id.ll_no_data);
        mBtInsert = (Button) findViewById(R.id.bt_insert_new);
    }

    private void queryData(String gjz, String type){
        //TODO 后期改造线程查询
        List<ChoiceQuestion> choiceQuestions = DBUtil.queryChoiceQuestion(gjz, type);
        if (null == choiceQuestions){
            return;
        }
        if (choiceQuestions.size()>0){
            mLlNoData.setVisibility(View.GONE);
            mLv.setVisibility(View.VISIBLE);
            mDataList.clear();
            mDataList.addAll(choiceQuestions);
            if (null != mAdapter){
                mAdapter.notifyDataSetChanged();
            }
        }else {
            mLlNoData.setVisibility(View.VISIBLE);
            mLv.setVisibility(View.GONE);
        }
    }
}
