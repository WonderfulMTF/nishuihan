package com.nsh.dtq.db;

import com.nsh.dtq.NshApplication;
import com.nsh.dtq.entity.ChoiceQuestion;

import java.util.List;

/**
 * Created by licong on 2018/8/2.
 */

public class DBUtil {

    /**
     * 根据问题搜索
     */
    public static String CHOICE_QUESTION_TYPE = "question";
    /**
     * 根据选项搜索
     */
    public static String CHOICE_ANSWER_TYPE = "answer";

    /**
     * 插入选择题数据
     * @param choiceQuestion
     * @return
     */
    public static boolean insertChoiceQuestion(ChoiceQuestion choiceQuestion){
        try {
            ChoiceQuestionDao choiceQuestionDao = NshApplication.getInstances().getDaoSession().getChoiceQuestionDao();
            choiceQuestionDao.insert(choiceQuestion);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 删除选择题数据
     * @param choiceQuestion
     * @return
     */
    public static boolean deleteChoiceQuestion(ChoiceQuestion choiceQuestion){
        try {
            ChoiceQuestionDao choiceQuestionDao = NshApplication.getInstances().getDaoSession().getChoiceQuestionDao();
            choiceQuestionDao.delete(choiceQuestion);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 修改选择题数据
     * @param choiceQuestion
     * @return
     */
    public static boolean uptateChoiceQuestion(ChoiceQuestion choiceQuestion){
        try {
            ChoiceQuestionDao choiceQuestionDao = NshApplication.getInstances().getDaoSession().getChoiceQuestionDao();
            choiceQuestionDao.update(choiceQuestion);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 查看选择题数据
     * @param gjz
     * @param type
     */
    public static List<ChoiceQuestion> queryChoiceQuestion(String gjz, String type){
        List<ChoiceQuestion> list = null;
        try {
            ChoiceQuestionDao choiceQuestionDao = NshApplication.getInstances().getDaoSession().getChoiceQuestionDao();
            if (type.equals(CHOICE_QUESTION_TYPE)){
                list = choiceQuestionDao.queryBuilder().where(ChoiceQuestionDao.Properties.Question.like("%" + gjz + "%"))
                        .list();
            }else if (type.equals(CHOICE_ANSWER_TYPE)){
                list = choiceQuestionDao.queryBuilder()
                        .whereOr(ChoiceQuestionDao.Properties.AnswerA.like("%" + gjz + "%")
                                , ChoiceQuestionDao.Properties.AnswerB.like("%" + gjz + "%")
                                , ChoiceQuestionDao.Properties.AnswerC.like("%" + gjz + "%")
                                , ChoiceQuestionDao.Properties.AnswerD.like("%" + gjz + "%"))
                        .list();
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
