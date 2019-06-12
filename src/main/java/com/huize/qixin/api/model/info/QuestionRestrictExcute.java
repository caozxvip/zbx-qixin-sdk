package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QuestionRestrictExcute
{
    private Integer restrictId;
    private Integer questionId;
    private Integer answerId;
    private Integer conditions;
    private String excuteValue;
    private Integer excuteUnit;
    
    public Integer getRestrictId() {
        return this.restrictId;
    }
    
    public void setRestrictId(final Integer restrictId) {
        this.restrictId = restrictId;
    }
    
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(final Integer questionId) {
        this.questionId = questionId;
    }
    
    public Integer getAnswerId() {
        return this.answerId;
    }
    
    public void setAnswerId(final Integer answerId) {
        this.answerId = answerId;
    }
    
    public Integer getConditions() {
        return this.conditions;
    }
    
    public void setConditions(final Integer conditions) {
        this.conditions = conditions;
    }
    
    public String getExcuteValue() {
        return this.excuteValue;
    }
    
    public void setExcuteValue(final String excuteValue) {
        this.excuteValue = excuteValue;
    }
    
    public Integer getExcuteUnit() {
        return this.excuteUnit;
    }
    
    public void setExcuteUnit(final Integer excuteUnit) {
        this.excuteUnit = excuteUnit;
    }
}
