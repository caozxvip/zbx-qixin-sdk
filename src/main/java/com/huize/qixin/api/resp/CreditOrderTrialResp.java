package com.huize.qixin.api.resp;

import com.huize.qixin.api.resp.trial.SimpleTrialResp;

public class CreditOrderTrialResp extends SimpleTrialResp
{
    private String priceArgs;
    
    public String getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final String priceArgs) {
        this.priceArgs = priceArgs;
    }
}
