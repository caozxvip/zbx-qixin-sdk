package com.huize.qixin.api.req.order;

import com.huize.qixin.api.req.*;

public class OrderStatisticsReq extends BaseReq
{
    private int orderType;
    private String startDate;
    
    public int getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(final int orderType) {
        this.orderType = orderType;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
}
