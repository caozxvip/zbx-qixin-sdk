package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class IntelligentSelectionResp extends BaseResp
{
    private List<SelectionProduct> products;
    
    public List<SelectionProduct> getProducts() {
        return this.products;
    }
    
    public void setProducts(final List<SelectionProduct> products) {
        this.products = products;
    }
}
