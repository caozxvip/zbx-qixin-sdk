package com.huize.qixin.api.resp.alasan;

import com.huize.qixin.api.model.info.InsureAbstract;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

public class QueryInsureByInsurantResp extends BaseResp
{
    private List<InsureAbstract> insureAbstracts;
    
    public List<InsureAbstract> getInsureAbstracts() {
        return this.insureAbstracts;
    }
    
    public void setInsureAbstracts(final List<InsureAbstract> insureAbstracts) {
        this.insureAbstracts = insureAbstracts;
    }
}
