package com.huize.qixin.api.req.alasan;

import com.huize.qixin.api.req.*;

public class QueryInsureByInsurantReq extends BaseReq
{
    private int cardType;
    private String cardCode;
    
    public int getCardType() {
        return this.cardType;
    }
    
    public void setCardType(final int cardType) {
        this.cardType = cardType;
    }
    
    public String getCardCode() {
        return this.cardCode;
    }
    
    public void setCardCode(final String cardCode) {
        this.cardCode = cardCode;
    }
}
