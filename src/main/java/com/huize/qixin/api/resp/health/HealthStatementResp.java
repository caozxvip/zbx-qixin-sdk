package com.huize.qixin.api.resp.health;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthStatementResp extends BaseResp
{
    private Integer healthId;
    private String caseCode;
    private String healthTitle;
    private Integer contentType;
    private Integer selectType;
    private Integer moduleType;
    private List<HealthyModule> healthyModules;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public Integer getContentType() {
        return this.contentType;
    }
    
    public void setContentType(final Integer contentType) {
        this.contentType = contentType;
    }
    
    public Integer getSelectType() {
        return this.selectType;
    }
    
    public void setSelectType(final Integer selectType) {
        this.selectType = selectType;
    }
    
    public List<HealthyModule> getHealthyModules() {
        return this.healthyModules;
    }
    
    public void setHealthyModules(final List<HealthyModule> healthyModules) {
        this.healthyModules = healthyModules;
    }
    
    public Integer getHealthId() {
        return this.healthId;
    }
    
    public void setHealthId(final Integer healthId) {
        this.healthId = healthId;
    }
    
    public String getHealthTitle() {
        return this.healthTitle;
    }
    
    public void setHealthTitle(final String healthTitle) {
        this.healthTitle = healthTitle;
    }
    
    public Integer getModuleType() {
        return this.moduleType;
    }
    
    public void setModuleType(final Integer moduleType) {
        this.moduleType = moduleType;
    }
}
