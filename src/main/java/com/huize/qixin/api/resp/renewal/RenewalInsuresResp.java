package com.huize.qixin.api.resp.renewal;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class RenewalInsuresResp extends BaseResp
{
    private String endDateFrom;
    private String endDateTo;
    private List<RenewalInsure> renewalInsures;
    
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
    
    public List<RenewalInsure> getRenewalInsures() {
        return this.renewalInsures;
    }
    
    public void setRenewalInsures(final List<RenewalInsure> renewalInsures) {
        this.renewalInsures = renewalInsures;
    }
}
