package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.resp.*;
import com.huize.qixin.api.model.info.*;

public class OrderDetailResp extends BaseResp
{
    private OrderDetail orderDetail;
    
    public OrderDetail getOrderDetail() {
        return this.orderDetail;
    }
    
    public void setOrderDetail(final OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }
}
