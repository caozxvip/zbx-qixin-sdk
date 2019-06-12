package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class ProductInsuredAreaResp extends BaseResp
{
    private String caseCode;
    private List<AreaInfo> areas;
    
    public List<AreaInfo> getAreas() {
        return this.areas;
    }
    
    public void setAreas(final List<AreaInfo> areas) {
        this.areas = areas;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
