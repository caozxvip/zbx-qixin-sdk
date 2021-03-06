package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.model.info.ProductInsuredJob;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

public class ProductInsuredJobResp extends BaseResp
{
    private String caseCode;
    private List<ProductInsuredJob> jobs;
    
    public List<ProductInsuredJob> getJobs() {
        return this.jobs;
    }
    
    public void setJobs(final List<ProductInsuredJob> jobs) {
        this.jobs = jobs;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
