package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.resp.*;
import com.huize.qixin.api.model.info.*;

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
