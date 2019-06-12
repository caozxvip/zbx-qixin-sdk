package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuditRemark
{
    private String remark;
    private String createTime;
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = remark;
    }
    
    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(final String createTime) {
        this.createTime = createTime;
    }
}
