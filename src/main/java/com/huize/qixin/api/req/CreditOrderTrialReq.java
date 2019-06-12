package com.huize.qixin.api.req;

public class CreditOrderTrialReq extends BaseReq
{
    private String caseCode;
    private String startDate;
    private String endDate;
    private String jobInfo;
    private String birthday;
    private String basicCoverage;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }
    
    public String getJobInfo() {
        return this.jobInfo;
    }
    
    public void setJobInfo(final String jobInfo) {
        this.jobInfo = jobInfo;
    }
    
    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(final String birthday) {
        this.birthday = birthday;
    }
    
    public String getBasicCoverage() {
        return this.basicCoverage;
    }
    
    public void setBasicCoverage(final String basicCoverage) {
        this.basicCoverage = basicCoverage;
    }
}
