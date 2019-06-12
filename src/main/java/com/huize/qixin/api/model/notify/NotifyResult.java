package com.huize.qixin.api.model.notify;

public class NotifyResult
{
    private boolean state;
    private String failMsg;
    
    NotifyResult() {
    }
    
    public NotifyResult(final boolean state, final String failMsg) {
        this.failMsg = failMsg;
        this.state = state;
    }
    
    public boolean isState() {
        return this.state;
    }
    
    public void setState(final boolean state) {
        this.state = state;
    }
    
    public String getFailMsg() {
        return this.failMsg;
    }
    
    public void setFailMsg(final String failMsg) {
        this.failMsg = failMsg;
    }
}
