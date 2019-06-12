package com.huize.qixin.api.model.notify;

import java.util.*;

public class IssueNotify extends BaseNotify
{
    private List<PolicyInfo> policys;
    
    public List<PolicyInfo> getPolicys() {
        return this.policys;
    }
    
    public void setPolicys(final List<PolicyInfo> policys) {
        this.policys = policys;
    }
}
