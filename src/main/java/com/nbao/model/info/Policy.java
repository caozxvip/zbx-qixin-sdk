package com.nbao.model.info;

/**
 * @Description 保单信息
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:34
 **/
public class Policy {

    private String number;
    private String companyName;
    private String name;
    private String versionName;
    private long prem;
    private long coverage;
    private long begtime;
    private long endtime;
    private String payYears;
    private String payYearsType;
    private String payType;
    private String insuredPeriod;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public long getPrem() {
        return prem;
    }

    public void setPrem(long prem) {
        this.prem = prem;
    }

    public long getCoverage() {
        return coverage;
    }

    public void setCoverage(long coverage) {
        this.coverage = coverage;
    }

    public long getBegtime() {
        return begtime;
    }

    public void setBegtime(long begtime) {
        this.begtime = begtime;
    }

    public long getEndtime() {
        return endtime;
    }

    public void setEndtime(long endtime) {
        this.endtime = endtime;
    }

    public String getPayYears() {
        return payYears;
    }

    public void setPayYears(String payYears) {
        this.payYears = payYears;
    }

    public String getPayYearsType() {
        return payYearsType;
    }

    public void setPayYearsType(String payYearsType) {
        this.payYearsType = payYearsType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getInsuredPeriod() {
        return insuredPeriod;
    }

    public void setInsuredPeriod(String insuredPeriod) {
        this.insuredPeriod = insuredPeriod;
    }
}
