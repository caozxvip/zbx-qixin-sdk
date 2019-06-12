package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SmartHealthInfo
{
    private Integer healthType;
    private String healthNo;
    private String healthDescribe;
    private String answerValue;
    private String answerHealthNo;
    private List<SmartHealthInfo> healthAnswers;
    
    public Integer getHealthType() {
        return this.healthType;
    }
    
    public void setHealthType(final Integer healthType) {
        this.healthType = healthType;
    }
    
    public String getHealthNo() {
        return this.healthNo;
    }
    
    public void setHealthNo(final String healthNo) {
        this.healthNo = healthNo;
    }
    
    public String getHealthDescribe() {
        return this.healthDescribe;
    }
    
    public void setHealthDescribe(final String healthDescribe) {
        this.healthDescribe = healthDescribe;
    }
    
    public String getAnswerValue() {
        return this.answerValue;
    }
    
    public void setAnswerValue(final String answerValue) {
        this.answerValue = answerValue;
    }
    
    public String getAnswerHealthNo() {
        return this.answerHealthNo;
    }
    
    public void setAnswerHealthNo(final String answerHealthNo) {
        this.answerHealthNo = answerHealthNo;
    }
    
    public List<SmartHealthInfo> getHealthAnswers() {
        return this.healthAnswers;
    }
    
    public void setHealthAnswers(final List<SmartHealthInfo> healthAnswers) {
        this.healthAnswers = healthAnswers;
    }
}
