package com.nsh.dtq.db;

import android.content.SharedPreferences;
import android.text.TextUtils;

import com.nsh.dtq.NshApplication;
import com.nsh.dtq.R;
import com.nsh.dtq.entity.ChoiceQuestion;

/**
 * Created by licong on 2018/8/2.
 */
public class InitDataUtil {

    public static void initData(){
        SharedPreferences sp = NshApplication.getInstances().getSharedPreferences("sp_data", 0);
        String isFirst = sp.getString("isFirst", "false");
        if (!isFirst.equals("false")){
            return;
        }
        //TODO 后期改造线程插入
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question1)
                , getResString(R.string.cq_answer1), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question2)
                , getResString(R.string.cq_answer2), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question3)
                , getResString(R.string.cq_answer3), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question4)
                , getResString(R.string.cq_answer4), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question5)
                , getResString(R.string.cq_answer5), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question6)
                , getResString(R.string.cq_answer6), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question7)
                , getResString(R.string.cq_answer7), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question8)
                , getResString(R.string.cq_answer8), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question9)
                , getResString(R.string.cq_answer9), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question10)
                , getResString(R.string.cq_answer10), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question11)
                , getResString(R.string.cq_answer11), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question12)
                , getResString(R.string.cq_answer12), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question13)
                , getResString(R.string.cq_answer13), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question14)
                , getResString(R.string.cq_answer14), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question15)
                , getResString(R.string.cq_answer15), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question16)
                , getResString(R.string.cq_answer16), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question17)
                , getResString(R.string.cq_answer17), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question18)
                , getResString(R.string.cq_answer18), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question19)
                , getResString(R.string.cq_answer19), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question20)
                , getResString(R.string.cq_answer20), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question21)
                , getResString(R.string.cq_answer21), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question22)
                , getResString(R.string.cq_answer22), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question23)
                , getResString(R.string.cq_answer23), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question24)
                , getResString(R.string.cq_answer24), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question25)
                , getResString(R.string.cq_answer25), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question26)
                , getResString(R.string.cq_answer26), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question27)
                , getResString(R.string.cq_answer27), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question28)
                , getResString(R.string.cq_answer28), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question29)
                , getResString(R.string.cq_answer29), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question30)
                , getResString(R.string.cq_answer30), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question31)
                , getResString(R.string.cq_answer31), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question32)
                , getResString(R.string.cq_answer32), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question33)
                , getResString(R.string.cq_answer33), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question34)
                , getResString(R.string.cq_answer34), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question35)
                , getResString(R.string.cq_answer35), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question36)
                , getResString(R.string.cq_answer36), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question37)
                , getResString(R.string.cq_answer37), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question38)
                , getResString(R.string.cq_answer38), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question39)
                , getResString(R.string.cq_answer39), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question40)
                , getResString(R.string.cq_answer40), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question41)
                , getResString(R.string.cq_answer41), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question42)
                , getResString(R.string.cq_answer42), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question43)
                , getResString(R.string.cq_answer43), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question44)
                , getResString(R.string.cq_answer44), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question45)
                , getResString(R.string.cq_answer45), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question46)
                , getResString(R.string.cq_answer46), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question47)
                , getResString(R.string.cq_answer47), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question48)
                , getResString(R.string.cq_answer48), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question49)
                , getResString(R.string.cq_answer49), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question50)
                , getResString(R.string.cq_answer50), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question51)
                , getResString(R.string.cq_answer51), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question52)
                , getResString(R.string.cq_answer52), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question53)
                , getResString(R.string.cq_answer53), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question54)
                , getResString(R.string.cq_answer54), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question55)
                , getResString(R.string.cq_answer55), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question56)
                , getResString(R.string.cq_answer56), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question57)
                , getResString(R.string.cq_answer57), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question58)
                , getResString(R.string.cq_answer58), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question59)
                , getResString(R.string.cq_answer59), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question60)
                , getResString(R.string.cq_answer60), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question61)
                , getResString(R.string.cq_answer61), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question62)
                , getResString(R.string.cq_answer62), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question63)
                , getResString(R.string.cq_answer63), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question64)
                , getResString(R.string.cq_answer64), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question65)
                , getResString(R.string.cq_answer65), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question66)
                , getResString(R.string.cq_answer66), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question67)
                , getResString(R.string.cq_answer67), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question68)
                , getResString(R.string.cq_answer68), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question69)
                , getResString(R.string.cq_answer69), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question70)
                , getResString(R.string.cq_answer70), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question71)
                , getResString(R.string.cq_answer71), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question72)
                , getResString(R.string.cq_answer72), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question73)
                , getResString(R.string.cq_answer73), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question74)
                , getResString(R.string.cq_answer74), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question75)
                , getResString(R.string.cq_answer75), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question76)
                , getResString(R.string.cq_answer76), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question77)
                , getResString(R.string.cq_answer77), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question78)
                , getResString(R.string.cq_answer78), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question79)
                , getResString(R.string.cq_answer79), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question80)
                , getResString(R.string.cq_answer80), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question81)
                , getResString(R.string.cq_answer81), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question82)
                , getResString(R.string.cq_answer82), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question83)
                , getResString(R.string.cq_answer83), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question84)
                , getResString(R.string.cq_answer84), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question85)
                , getResString(R.string.cq_answer85), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question86)
                , getResString(R.string.cq_answer86), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question87)
                , getResString(R.string.cq_answer87), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question88)
                , getResString(R.string.cq_answer88), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question89)
                , getResString(R.string.cq_answer89), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question90)
                , getResString(R.string.cq_answer90), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question91)
                , getResString(R.string.cq_answer91), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question92)
                , getResString(R.string.cq_answer92), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question93)
                , getResString(R.string.cq_answer93), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question94)
                , getResString(R.string.cq_answer94), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question95)
                , getResString(R.string.cq_answer95), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question96)
                , getResString(R.string.cq_answer96), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question97)
                , getResString(R.string.cq_answer97), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question98)
                , getResString(R.string.cq_answer98), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question99)
                , getResString(R.string.cq_answer99), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question100)
                , getResString(R.string.cq_answer100), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question101)
                , getResString(R.string.cq_answer101), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question102)
                , getResString(R.string.cq_answer102), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question103)
                , getResString(R.string.cq_answer103), "", "", ""));
        DBUtil.insertChoiceQuestion(new ChoiceQuestion(getResString(R.string.cq_question104)
                , getResString(R.string.cq_answer104), "", "", ""));

        SharedPreferences.Editor editor = sp.edit();
        editor.putString("isFirst", "true");
        editor.commit();
    }

    private static String getResString(int id){
        String str = NshApplication.getInstances().getResources().getString(id);
        return TextUtils.isEmpty(str) ? "" : str;
    }

}
