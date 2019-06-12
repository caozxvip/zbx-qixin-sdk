package com.huize.qixin.api.model.info;

import java.util.*;

public class HealthyQaModule
{
    private Integer moduleId;
    private List<HealthyQaQuestion> healthyQaQuestions;
    
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(final Integer moduleId) {
        this.moduleId = moduleId;
    }
    
    public List<HealthyQaQuestion> getHealthyQaQuestions() {
        return this.healthyQaQuestions;
    }
    
    public void setHealthyQaQuestions(final List<HealthyQaQuestion> healthyQaQuestions) {
        this.healthyQaQuestions = healthyQaQuestions;
    }
}
