package com.huize.qixin.api.model.info;

import java.io.*;

public class BranchBankInfo implements Serializable
{
    private static final long serialVersionUID = 1250697413853924727L;
    private String bankBranchCode;
    private String bankBranchName;
    
    public String getBankBranchCode() {
        return this.bankBranchCode;
    }
    
    public void setBankBranchCode(final String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }
    
    public String getBankBranchName() {
        return this.bankBranchName;
    }
    
    public void setBankBranchName(final String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
}
