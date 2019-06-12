package com.huize.qixin.api.model.info;

import java.util.*;

public class HealthyQaQuestion
{
    private Integer questionId;
    private Integer parentId;
    private Byte questionSort;
    private List<HealthyQaAnswer> healthyQaAnswers;
    private List<HealthyQaQuestion> childrens;
    
    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(final Integer parentId) {
        this.parentId = parentId;
    }
    
    public List<HealthyQaAnswer> getHealthyQaAnswers() {
        return this.healthyQaAnswers;
    }
    
    public void setHealthyQaAnswers(final List<HealthyQaAnswer> healthyQaAnswers) {
        this.healthyQaAnswers = healthyQaAnswers;
    }
    
    public List<HealthyQaQuestion> getChildrens() {
        return this.childrens;
    }
    
    public void setChildrens(final List<HealthyQaQuestion> childrens) {
        this.childrens = childrens;
    }
    
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(final Integer questionId) {
        this.questionId = questionId;
    }
    
    public Byte getQuestionSort() {
        return this.questionSort;
    }
    
    public void setQuestionSort(final Byte questionSort) {
        this.questionSort = questionSort;
    }
}
