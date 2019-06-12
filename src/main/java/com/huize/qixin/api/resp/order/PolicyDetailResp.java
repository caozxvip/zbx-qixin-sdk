package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

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
