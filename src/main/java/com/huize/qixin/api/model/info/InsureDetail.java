package com.huize.qixin.api.model.info;

import java.util.*;
import com.huize.qixin.api.model.*;

public class InsureDetail extends OrderDetail
{
    private String thirdPartyProductCode;
    private List<EnsureProject> restrictGenes;
    private String otherInfo;
    
    public String getThirdPartyProductCode() {
        return this.thirdPartyProductCode;
    }
    
    public void setThirdPartyProductCode(final String thirdPartyProductCode) {
        this.thirdPartyProductCode = thirdPartyProductCode;
    }
    
    public List<EnsureProject> getRestrictGenes() {
        return this.restrictGenes;
    }
    
    public void setRestrictGenes(final List<EnsureProject> restrictGenes) {
        this.restrictGenes = restrictGenes;
    }
    
    public String getOtherInfo() {
        return this.otherInfo;
    }
    
    public void setOtherInfo(final String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
