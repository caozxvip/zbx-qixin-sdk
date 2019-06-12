package com.huize.qixin.api.req.trial;

import com.huize.qixin.api.req.*;
import java.io.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class TrialReq extends BaseReq implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String caseCode;
    private String startDate;
    private List<GeneParam> newRestrictGenes;
    private GeneParam oldRestrictGene;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<GeneParam> getNewRestrictGenes() {
        return this.newRestrictGenes;
    }
    
    public void setNewRestrictGenes(final List<GeneParam> newRestrictGenes) {
        this.newRestrictGenes = newRestrictGenes;
    }
    
    public GeneParam getOldRestrictGene() {
        return this.oldRestrictGene;
    }
    
    public void setOldRestrictGene(final GeneParam oldRestrictGene) {
        this.oldRestrictGene = oldRestrictGene;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
}
