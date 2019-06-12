package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class BranchBankAddressResp extends BaseResp
{
    private String caseCode;
    private List<BranchBankInfo> branchBankInfos;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<BranchBankInfo> getBranchBankInfos() {
        return this.branchBankInfos;
    }
    
    public void setBranchBankInfos(final List<BranchBankInfo> branchBankInfos) {
        this.branchBankInfos = branchBankInfos;
    }
}
