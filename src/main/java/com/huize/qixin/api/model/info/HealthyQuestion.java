package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyQuestion
{
    private Integer questionId;
    private String questionName;
    private Integer parentId;
    private Integer moduleId;
    private Integer answerType;
    private Integer questionLevel;
    private String remark;
    private Integer questionSort;
    private Integer hasRestrict;
    private String content;
    private List<HealthyAnswer> healthyAnswers;
    private HealthyQuestionRestrict questionRestrict;
    private List<HealthyQuestion> childrens;
    
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(final Integer questionId) {
        this.questionId = questionId;
    }
    
    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(final Integer parentId) {
        this.parentId = parentId;
    }
    
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(final Integer moduleId) {
        this.moduleId = moduleId;
    }
    
    public String getQuestionName() {
        return this.questionName;
    }
    
    public void setQuestionName(final String questionName) {
        this.questionName = questionName;
    }
    
    public Integer getAnswerType() {
        return this.answerType;
    }
    
    public void setAnswerType(final Integer answerType) {
        this.answerType = answerType;
    }
    
    public Integer getQuestionLevel() {
        return this.questionLevel;
    }
    
    public void setQuestionLevel(final Integer questionLevel) {
        this.questionLevel = questionLevel;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = remark;
    }
    
    public Integer getHasRestrict() {
        return this.hasRestrict;
    }
    
    public void setHasRestrict(final Integer hasRestrict) {
        this.hasRestrict = hasRestrict;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
    
    public List<HealthyAnswer> getHealthyAnswers() {
        return this.healthyAnswers;
    }
    
    public void setHealthyAnswers(final List<HealthyAnswer> healthyAnswers) {
        this.healthyAnswers = healthyAnswers;
    }
    
    public HealthyQuestionRestrict getQuestionRestrict() {
        return this.questionRestrict;
    }
    
    public void setQuestionRestrict(final HealthyQuestionRestrict questionRestrict) {
        this.questionRestrict = questionRestrict;
    }
    
    public List<HealthyQuestion> getChildrens() {
        return this.childrens;
    }
    
    public void setChildrens(final List<HealthyQuestion> childrens) {
        this.childrens = childrens;
    }
    
    public Integer getQuestionSort() {
        return this.questionSort;
    }
    
    public void setQuestionSort(final Integer questionSort) {
        this.questionSort = questionSort;
    }
}
