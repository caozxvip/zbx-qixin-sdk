package com.huize.qixin.api.model.info;

import java.util.*;

public class HealthyQa
{
    private Integer healthyId;
    private List<HealthyQaModule> healthyQaModules;
    
    public Integer getHealthyId() {
        return this.healthyId;
    }
    
    public void setHealthyId(final Integer healthyId) {
        this.healthyId = healthyId;
    }
    
    public List<HealthyQaModule> getHealthyQaModules() {
        return this.healthyQaModules;
    }
    
    public void setHealthyQaModules(final List<HealthyQaModule> healthyQaModules) {
        this.healthyQaModules = healthyQaModules;
    }
}
