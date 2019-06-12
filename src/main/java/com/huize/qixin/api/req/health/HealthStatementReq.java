package com.huize.qixin.api.req.health;

import com.huize.qixin.api.req.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class HealthStatementReq extends BaseReq
{
    private String caseCode;
    private List<GeneParam> genes;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<GeneParam> getGenes() {
        return this.genes;
    }
    
    public void setGenes(final List<GeneParam> genes) {
        this.genes = genes;
    }
}
