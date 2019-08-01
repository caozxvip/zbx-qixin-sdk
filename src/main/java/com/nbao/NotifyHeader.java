package com.nbao;

/**
 * @Description 报文头
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:23
 **/
public class NotifyHeader {

    private int type;

    private int channelid;

    private int dealid;

    private int time;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public int getDealid() {
        return dealid;
    }

    public void setDealid(int dealid) {
        this.dealid = dealid;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
