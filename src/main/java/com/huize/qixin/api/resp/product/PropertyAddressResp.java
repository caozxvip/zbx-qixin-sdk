package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class PropertyAddressResp extends BaseResp
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
