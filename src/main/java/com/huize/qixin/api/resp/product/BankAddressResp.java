package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.model.info.AreaInfo;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

public class BankAddressResp extends BaseResp
{
    private String caseCode;
    private List<AreaInfo> areas;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<AreaInfo> getAreas() {
        return this.areas;
    }
    
    public void setAreas(final List<AreaInfo> areas) {
        this.areas = areas;
    }
}
