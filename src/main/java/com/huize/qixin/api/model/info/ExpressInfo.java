package com.huize.qixin.api.model.info;

public class ExpressInfo
{
    private String name;
    private String address;
    private String telephone;
    private String remark;
    private Long expressFee;
    
    public Long getExpressFee() {
        return this.expressFee;
    }
    
    public void setExpressFee(final Long expressFee) {
        this.expressFee = expressFee;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(final String address) {
        this.address = address;
    }
    
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = remark;
    }
}
