package com.nbao.model.notify;

import com.nbao.model.info.*;

import java.util.List;

/**
 * @Description 支付完成
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:51
 **/
public class PayNotify {

    private Deal deal;
    private Policy policy;
    private Apply apply;
    private Insurant insurant;
    private List<Beneficiaries> beneficiaries;

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Apply getApply() {
        return apply;
    }

    public void setApply(Apply apply) {
        this.apply = apply;
    }

    public Insurant getInsurant() {
        return insurant;
    }

    public void setInsurant(Insurant insurant) {
        this.insurant = insurant;
    }

    public List<Beneficiaries> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<Beneficiaries> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
}
