package com.huize.qixin.api.model.info;

public class HealthyQaAnswer
{
    private Integer answerId;
    private String answerValue;
    private String keyCode;
    
    public Integer getAnswerId() {
        return this.answerId;
    }
    
    public void setAnswerId(final Integer answerId) {
        this.answerId = answerId;
    }
    
    public String getKeyCode() {
        return this.keyCode;
    }
    
    public void setKeyCode(final String keyCode) {
        this.keyCode = keyCode;
    }
    
    public String getAnswerValue() {
        return this.answerValue;
    }
    
    public void setAnswerValue(final String answerValue) {
        this.answerValue = answerValue;
    }
}
