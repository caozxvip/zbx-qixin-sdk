package com.huize.qixin.api.model.notify;

import com.huize.qixin.api.req.*;

public class SendNotifyReq extends BaseReq
{
    private String insureNum;
    private int withholdFlag;
    private String date;
    private String startTime;
    private String endTime;
    private Byte repairType;
    private Byte notifyType;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public int getWithholdFlag() {
        return this.withholdFlag;
    }
    
    public void setWithholdFlag(final int withholdFlag) {
        this.withholdFlag = withholdFlag;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(final String date) {
        this.date = date;
    }
    
    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(final String startTime) {
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(final String endTime) {
        this.endTime = endTime;
    }
    
    public Byte getRepairType() {
        return this.repairType;
    }
    
    public void setRepairType(final Byte repairType) {
        this.repairType = repairType;
    }
    
    public Byte getNotifyType() {
        return this.notifyType;
    }
    
    public void setNotifyType(final Byte notifyType) {
        this.notifyType = notifyType;
    }
}
