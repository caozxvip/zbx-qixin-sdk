package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;

public class PartnerCpsInfoResp extends BaseResp
{
    private String partnerUniqKey;
    private String caseCode;
    private String cuid;
    
    public String getPartnerUniqKey() {
        return this.partnerUniqKey;
    }
    
    public void setPartnerUniqKey(final String partnerUniqKey) {
        this.partnerUniqKey = partnerUniqKey;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getCuid() {
        return this.cuid;
    }
    
    public void setCuid(final String cuid) {
        this.cuid = cuid;
    }
}
