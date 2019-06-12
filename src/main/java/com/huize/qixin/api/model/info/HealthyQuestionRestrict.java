package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyQuestionRestrict
{
    private Integer questionId;
    private Integer executeType;
    private List<QuestionRestrictExcute> restrictExcutes;
    
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(final Integer questionId) {
        this.questionId = questionId;
    }
    
    public Integer getExecuteType() {
        return this.executeType;
    }
    
    public void setExecuteType(final Integer executeType) {
        this.executeType = executeType;
    }
    
    public List<QuestionRestrictExcute> getRestrictExcutes() {
        return this.restrictExcutes;
    }
    
    public void setRestrictExcutes(final List<QuestionRestrictExcute> restrictExcutes) {
        this.restrictExcutes = restrictExcutes;
    }
}
