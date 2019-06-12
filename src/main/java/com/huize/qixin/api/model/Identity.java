package com.huize.qixin.api.model;

public class Identity
{
    private boolean isValid;
    private String errMsg;
    private int sex;
    private String birthDay;
    
    public boolean isValid() {
        return this.isValid;
    }
    
    public void setValid(final boolean isValid) {
        this.isValid = isValid;
    }
    
    public String getErrMsg() {
        return this.errMsg;
    }
    
    public void setErrMsg(final String errMsg) {
        this.errMsg = errMsg;
    }
    
    public int getSex() {
        return this.sex;
    }
    
    public void setSex(final int sex) {
        this.sex = sex;
    }
    
    public String getBirthDay() {
        return this.birthDay;
    }
    
    public void setBirthDay(final String birthDay) {
        this.birthDay = birthDay;
    }
}
