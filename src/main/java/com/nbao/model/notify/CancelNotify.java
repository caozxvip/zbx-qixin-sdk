package com.nbao.model.notify;

import com.nbao.model.info.Deal;

/**
 * @Description 退保通知
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:45
 **/
public class CancelNotify {
    private Deal deal;

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
}
