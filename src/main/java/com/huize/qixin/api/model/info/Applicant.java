package com.huize.qixin.api.model.info;

public class Applicant extends PeopleInfo
{
    private int applicantType;
    
    public int getApplicantType() {
        return this.applicantType;
    }
    
    public void setApplicantType(final int applicantType) {
        this.applicantType = applicantType;
    }
}
