package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.model.info.OrderSummary;
import com.huize.qixin.api.model.info.PageModel;
import com.huize.qixin.api.resp.BaseResp;

public class SummaryOrderResp extends BaseResp
{
    private PageModel<OrderSummary> data;
    
    public PageModel<OrderSummary> getData() {
        return this.data;
    }
    
    public void setData(final PageModel<OrderSummary> data) {
        this.data = data;
    }
}
