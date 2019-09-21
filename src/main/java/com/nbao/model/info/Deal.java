package com.nbao.model.info;

/**
 * @Description 订单信息
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:32
 **/
public class Deal {

    private long dealid;
    private long itemid;
    private String channelid;
    private String channeluserid;
    private String subagent;
    private String SubagentID;
    private String policyUrl;
    private long addtime;
    private long paytime;
    private long payment;

    public long getDealid() {
        return dealid;
    }

    public void setDealid(long dealid) {
        this.dealid = dealid;
    }

    public long getItemid() {
        return itemid;
    }

    public void setItemid(long itemid) {
        this.itemid = itemid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
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

    public long getAddtime() {
        return addtime;
    }

    public void setAddtime(long addtime) {
        this.addtime = addtime;
    }

    public long getPaytime() {
        return paytime;
    }

    public void setPaytime(long paytime) {
        this.paytime = paytime;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }
}
