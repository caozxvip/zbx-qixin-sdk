package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AttributeModule
{
    private Integer moduleId;
    private String name;
    private String remark;
    private List<ProductAttribute> productAttributes;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = remark;
    }
    
    public List<ProductAttribute> getProductAttributes() {
        return this.productAttributes;
    }
    
    public void setProductAttributes(final List<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }
    
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(final Integer moduleId) {
        this.moduleId = moduleId;
    }
}
