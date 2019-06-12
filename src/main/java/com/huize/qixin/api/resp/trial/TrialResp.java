package com.huize.qixin.api.resp.trial;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TrialResp extends BaseResp
{
    private String caseCode;
    private long price;
    private long originalPrice;
    private List<RestrictGene> restrictGenes;
    private List<ProtectItem> protectItems;
    private TrailPremiumParam priceArgs;
    
    public List<RestrictGene> getRestrictGenes() {
        return this.restrictGenes;
    }
    
    public void setRestrictGenes(final List<RestrictGene> restrictGenes) {
        this.restrictGenes = restrictGenes;
    }
    
    public List<ProtectItem> getProtectItems() {
        return this.protectItems;
    }
    
    public void setProtectItems(final List<ProtectItem> protectItems) {
        this.protectItems = protectItems;
    }
    
    public TrailPremiumParam getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final TrailPremiumParam priceArgs) {
        this.priceArgs = priceArgs;
    }
    
    public long getPrice() {
        return this.price;
    }
    
    public void setPrice(final long price) {
        this.price = price;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public long getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(final long originalPrice) {
        this.originalPrice = originalPrice;
    }
}
