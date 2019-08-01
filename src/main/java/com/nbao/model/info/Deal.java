package com.nbao.model.info;

/**
 * @Description 订单信息
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:32
 **/
public class Deal {

    private int dealid;
    private int itemid;
    private int channelid;
    private String channeluserid;
    private String subagent;
    private String SubagentID;
    private String policyUrl;
    private int addtime;
    private int paytime;
    private int payment;

    public int getDealid() {
        return dealid;
    }

    public void setDealid(int dealid) {
        this.dealid = dealid;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public String getChanneluserid() {
        return channeluserid;
    }

    public void setChanneluserid(String channeluserid) {
        this.channeluserid = channeluserid;
    }

    public String getSubagent() {
        return subagent;
    }

    public void setSubagent(String subagent) {
        this.subagent = subagent;
    }

    public String getSubagentID() {
        return SubagentID;
    }

    public void setSubagentID(String subagentID) {
        SubagentID = subagentID;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
    }

    public int getAddtime() {
        return addtime;
    }

    public void setAddtime(int addtime) {
        this.addtime = addtime;
    }

    public int getPaytime() {
        return paytime;
    }

    public void setPaytime(int paytime) {
        this.paytime = paytime;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
