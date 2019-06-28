package com.huize.qixin.api.req.health;

import com.huize.qixin.api.model.info.HealthyQa;
import com.huize.qixin.api.model.info.GeneParam;
import java.util.List;
import com.huize.qixin.api.req.BaseReq;

public class SubmitHealthStateReq extends BaseReq
{
    private String caseCode;
    private List<GeneParam> genes;
    private HealthyQa qaAnswer;
    
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
    
    public HealthyQa getQaAnswer() {
        return this.qaAnswer;
    }
    
    public void setQaAnswer(final HealthyQa qaAnswer) {
        this.qaAnswer = qaAnswer;
    }
}
