package com.huize.qixin.api.resp.alasan;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

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
