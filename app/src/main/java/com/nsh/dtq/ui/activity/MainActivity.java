package com.nsh.dtq.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.nsh.dtq.R;
import com.nsh.dtq.db.DBUtil;
import com.nsh.dtq.db.InitDataUtil;
import com.nsh.dtq.entity.ChoiceQuestion;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitDataUtil.initData();

        Button btChoice = (Button) findViewById(R.id.bt_choice_question);
        btChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChoiceQuestionActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btClue = (Button) findViewById(R.id.bt_clue_question);
        btClue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "敬请期待", Toast.LENGTH_SHORT).show();
            }
        });

        Button btPoetry = (Button) findViewById(R.id.bt_poetry_question);
        btPoetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "敬请期待", Toast.LENGTH_SHORT).show();
            }
        });

        Button btNew = (Button) findViewById(R.id.bt_insert_new);
        btNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = new String[] { "选择题", "线索填空题", "诗词选字题" };
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("请选择录入题型")
                        .setItems(items, new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which){
                                    case 0:
                                        Intent intent = new Intent(MainActivity.this, InsertNewActivity.class);
                                        intent.putExtra("type", InsertNewActivity.INSERT_TYPE_CHOICE);
                                        MainActivity.this.startActivity(intent);
                                        break;
                                    case  1:
                                        Toast.makeText(MainActivity.this, "敬请期待", Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(MainActivity.this, "敬请期待", Toast.LENGTH_SHORT).show();
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
}
