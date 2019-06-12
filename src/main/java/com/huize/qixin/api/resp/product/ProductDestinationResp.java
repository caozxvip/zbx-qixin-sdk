package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class ProductDestinationResp extends BaseResp
{
    private String caseCode;
    private boolean chooseOne;
    private List<ProductDestination> destinations;
    
    public boolean isChooseOne() {
        return this.chooseOne;
    }
    
    public void setChooseOne(final boolean chooseOne) {
        this.chooseOne = chooseOne;
    }
    
    public List<ProductDestination> getDestinations() {
        return this.destinations;
    }
    
    public void setDestinations(final List<ProductDestination> destinations) {
        this.destinations = destinations;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
