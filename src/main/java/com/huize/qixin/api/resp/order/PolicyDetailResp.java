package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.model.info.OrderDetail;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

public class PolicyDetailResp extends BaseResp
{
    private List<OrderDetail> policyDetails;
    
    public List<OrderDetail> getPolicyDetails() {
        return this.policyDetails;
    }
    
    public void setPolicyDetails(final List<OrderDetail> policyDetails) {
        this.policyDetails = policyDetails;
    }
}
