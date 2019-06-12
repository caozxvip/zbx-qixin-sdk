package com.qixin.openapi.model.common;

public class CommonResult<T>
{
    private int respCode;
    private String respMsg;
    private T data;
    
    public int getRespCode() {
        return this.respCode;
    }
    
    public void setRespCode(final int respCode) {
        this.respCode = respCode;
    }
    
    public String getRespMsg() {
        return this.respMsg;
    }
    
    public void setRespMsg(final String respMsg) {
        this.respMsg = respMsg;
    }
    
    public T getData() {
        return this.data;
    }
    
    public void setData(final T data) {
        this.data = data;
    }
}
