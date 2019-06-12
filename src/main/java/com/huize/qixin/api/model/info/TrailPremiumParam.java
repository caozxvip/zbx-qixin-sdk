package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TrailPremiumParam
{
    private int productId;
    private int productPlanId;
    private List<GeneParam> genes;
    
    public TrailPremiumParam() {
    }
    
    public TrailPremiumParam(final int productId, final int productPlanId) {
        this.productId = productId;
        this.productPlanId = productPlanId;
    }
    
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(final int productId) {
        this.productId = productId;
    }
    
    public int getProductPlanId() {
        return this.productPlanId;
    }
    
    public void setProductPlanId(final int productPlanId) {
        this.productPlanId = productPlanId;
    }
    
    public List<GeneParam> getGenes() {
        return this.genes;
    }
    
    public void setGenes(final List<GeneParam> genes) {
        this.genes = genes;
    }
}
