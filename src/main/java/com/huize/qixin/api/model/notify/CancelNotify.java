package com.huize.qixin.api.model.notify;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CancelNotify extends BaseNotify
{
    private String cancelMsg;
    private String newInsureNum;
    private List<String> cancelInsurants;
    
    public String getCancelMsg() {
        return this.cancelMsg;
    }
    
    public void setCancelMsg(final String cancelMsg) {
        this.cancelMsg = cancelMsg;
    }
    
    public String getNewInsureNum() {
        return this.newInsureNum;
    }
    
    public void setNewInsureNum(final String newInsureNum) {
        this.newInsureNum = newInsureNum;
    }
    
    public List<String> getCancelInsurants() {
        return this.cancelInsurants;
    }
    
    public void setCancelInsurants(final List<String> cancelInsurants) {
        this.cancelInsurants = cancelInsurants;
    }
}
