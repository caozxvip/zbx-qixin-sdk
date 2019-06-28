package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.model.info.InsureDetail;
import com.huize.qixin.api.resp.BaseResp;

public class InsureDetailResp extends BaseResp
{
    private InsureDetail insureDetail;
    
    public InsureDetail getInsureDetail() {
        return this.insureDetail;
    }
    
    public void setInsureDetail(final InsureDetail insureDetail) {
        this.insureDetail = insureDetail;
    }
}
