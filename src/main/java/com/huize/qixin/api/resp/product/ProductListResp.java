package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class ProductListResp extends BaseResp
{
    private List<Product> products;
    
    public List<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(final List<Product> products) {
        this.products = products;
    }
}
