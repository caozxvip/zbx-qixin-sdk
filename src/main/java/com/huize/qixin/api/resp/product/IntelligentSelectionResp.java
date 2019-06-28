package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.model.info.SelectionProduct;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

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
