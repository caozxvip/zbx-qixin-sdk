package com.huize.qixin.api.req;

import com.huize.qixin.api.model.info.*;

public abstract class BaseReq extends CoreBaseReq
{
    private ApiPartnerVo apiPartner;
    private Integer saveType;
    
    public Integer getSaveType() {
        return this.saveType;
    }
    
    public void setSaveType(final Integer saveType) {
        this.saveType = saveType;
    }
    
    public ApiPartnerVo getApiPartner() {
        return this.apiPartner;
    }
    
    public void setApiPartner(final ApiPartnerVo apiPartner) {
        this.apiPartner = apiPartner;
    }
}
