package com.huize.qixin.api.req.order;

import com.huize.qixin.api.req.*;

public class SummaryOrderReq extends PageReq
{
    private String date;
    private int type;
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(final String date) {
        this.date = date;
    }
    
    public int getType() {
        return this.type;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
}
