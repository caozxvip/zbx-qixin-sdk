package com.huize.qixin.api.req.renewal;

import com.huize.qixin.api.req.*;

public class RenewalInsuresReq extends BaseReq
{
    private String endDateFrom;
    private String endDateTo;
    
    public String getEndDateFrom() {
        return this.endDateFrom;
    }
    
    public void setEndDateFrom(final String endDateFrom) {
        this.endDateFrom = endDateFrom;
    }
    
    public String getEndDateTo() {
        return this.endDateTo;
    }
    
    public void setEndDateTo(final String endDateTo) {
        this.endDateTo = endDateTo;
    }
}
