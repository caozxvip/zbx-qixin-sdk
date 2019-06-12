package com.huize.qixin.api.model.info;

public class TripProtectItemJson
{
    private int trialItemId;
    private int protectItemId;
    private String name;
    private String fullPremium;
    private String description;
    
    public int getTrialItemId() {
        return this.trialItemId;
    }
    
    public void setTrialItemId(final int trialItemId) {
        this.trialItemId = trialItemId;
    }
    
    public int getProtectItemId() {
        return this.protectItemId;
    }
    
    public void setProtectItemId(final int protectItemId) {
        this.protectItemId = protectItemId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getFullPremium() {
        return this.fullPremium;
    }
    
    public void setFullPremium(final String fullPremium) {
        this.fullPremium = fullPremium;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
}
