package com.huize.qixin.api.req.trial;

import com.huize.qixin.api.req.*;
import java.io.*;
import java.util.*;

public class SimpleTrialReq extends BaseReq implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String caseCode;
    private String birthday;
    private String startDate;
    private String endDate;
    private Map<String, String> extMap;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(final String birthday) {
        this.birthday = birthday;
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
    
    public Map<String, String> getExtMap() {
        return this.extMap;
    }
    
    public void setExtMap(final Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
