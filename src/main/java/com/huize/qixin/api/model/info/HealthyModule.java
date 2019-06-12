package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyModule
{
    private Integer moduleId;
    private String keyCode;
    private String moduleName;
    private String moduleRemark;
    private Integer moduleSort;
    private List<HealthyQuestion> healthyQuestions;
    
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(final Integer moduleId) {
        this.moduleId = moduleId;
    }
    
    public String getKeyCode() {
        return this.keyCode;
    }
    
    public void setKeyCode(final String keyCode) {
        this.keyCode = keyCode;
    }
    
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(final String moduleName) {
        this.moduleName = moduleName;
    }
    
    public String getModuleRemark() {
        return this.moduleRemark;
    }
    
    public void setModuleRemark(final String moduleRemark) {
        this.moduleRemark = moduleRemark;
    }
    
    public Integer getModuleSort() {
        return this.moduleSort;
    }
    
    public void setModuleSort(final Integer moduleSort) {
        this.moduleSort = moduleSort;
    }
    
    public List<HealthyQuestion> getHealthyQuestions() {
        return this.healthyQuestions;
    }
    
    public void setHealthyQuestions(final List<HealthyQuestion> healthyQuestions) {
        this.healthyQuestions = healthyQuestions;
    }
}
