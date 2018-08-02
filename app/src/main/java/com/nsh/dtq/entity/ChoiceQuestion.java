package com.nsh.dtq.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by licong on 2018/8/2.
 */
@Entity
public class ChoiceQuestion {
    @Id(autoincrement = true)
    private Long id;

    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    @Generated(hash = 98510024)
    public ChoiceQuestion(Long id, String question, String answerA, String answerB,
            String answerC, String answerD) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }

    public ChoiceQuestion(String question, String answerA, String answerB, String answerC, String answerD) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }

    @Generated(hash = 304941608)
    public ChoiceQuestion() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getQuestion() {
        return this.question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswerA() {
        return this.answerA;
    }
    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }
    public String getAnswerB() {
        return this.answerB;
    }
    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }
    public String getAnswerC() {
        return this.answerC;
    }
    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }
    public String getAnswerD() {
        return this.answerD;
    }
    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

}
