package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class ProductAllInsuredAreaResp extends BaseResp
{
    private String caseCode;
    private List<AreaTreeInfo> areas;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<AreaTreeInfo> getAreas() {
        return this.areas;
    }
    
    public void setAreas(final List<AreaTreeInfo> areas) {
        this.areas = areas;
    }
}
