package com.huize.qixin.api.resp.insure;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsureResp extends BaseResp
{
    private String insureNum;
    private String startDate;
    private String endDate;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }
}
