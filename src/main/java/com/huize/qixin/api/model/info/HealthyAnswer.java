package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyAnswer
{
    private Integer answerId;
    private Integer belongQuestionId;
    private String description;
    private String questionIds;
    private Integer attributeId;
    private HealthyAttribute healthyAttribute;
    
    public Integer getAnswerId() {
        return this.answerId;
    }
    
    public void setAnswerId(final Integer answerId) {
        this.answerId = answerId;
    }
    
    public Integer getBelongQuestionId() {
        return this.belongQuestionId;
    }
    
    public void setBelongQuestionId(final Integer belongQuestionId) {
        this.belongQuestionId = belongQuestionId;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public String getQuestionIds() {
        return this.questionIds;
    }
    
    public void setQuestionIds(final String questionIds) {
        this.questionIds = questionIds;
    }
    
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    public void setAttributeId(final Integer attributeId) {
        this.attributeId = attributeId;
    }
    
    public HealthyAttribute getHealthyAttribute() {
        return this.healthyAttribute;
    }
    
    public void setHealthyAttribute(final HealthyAttribute healthyAttribute) {
        this.healthyAttribute = healthyAttribute;
    }
}
