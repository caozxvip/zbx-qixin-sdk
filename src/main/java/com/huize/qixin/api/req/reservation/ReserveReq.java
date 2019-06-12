package com.huize.qixin.api.req.reservation;

import com.huize.qixin.api.req.*;

public class ReserveReq extends BaseReq
{
    private int clientType;
    private String caseCode;
    private String name;
    private String telephone;
    private String contactDateDesc;
    private int sex;
    private String email;
    private String address;
    
    public int getClientType() {
        return this.clientType;
    }
    
    public void setClientType(final int clientType) {
        this.clientType = clientType;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }
    
    public String getContactDateDesc() {
        return this.contactDateDesc;
    }
    
    public void setContactDateDesc(final String contactDateDesc) {
        this.contactDateDesc = contactDateDesc;
    }
    
    public int getSex() {
        return this.sex;
    }
    
    public void setSex(final int sex) {
        this.sex = sex;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(final String address) {
        this.address = address;
    }
}
