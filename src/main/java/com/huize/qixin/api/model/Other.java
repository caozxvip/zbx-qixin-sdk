package com.huize.qixin.api.model;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Other
{
    private int applicantType;
    private String propertyAddress;
    private String propertyAddressText;
    private String fltNo;
    private Integer isPrintAirUnionItinerary;
    private String fltTicketNo;
    private Integer tripPurpose;
    private String tripPurposeName;
    private String destination;
    private String workCompanyName;
    private String workEmail;
    private Integer petOwner;
    private String dogLicense;
    private String dogImmuneLicense;
    private String dogSpecies;
    private Integer renewalPayBank;
    private String renewalPayBankName;
    private String renewalPayAccount;
    private String renewalPayCardholder;
    private String renewalPayBankAddr;
    private String renewalPayBankProvText;
    private String renewalPayBankCityText;
    private String renewalPayBankAreaText;
    private Integer withholdBank;
    private String withholdBankName;
    private String withholdCardholder;
    private String withholdAccount;
    private Integer renewalBank;
    private String renewalBankName;
    private String renewalCardholder;
    private String renewalAccount;
    private String urgencyContact;
    private String urgencyContactMobile;
    
    public int getApplicantType() {
        return this.applicantType;
    }
    
    public void setApplicantType(final int applicantType) {
        this.applicantType = applicantType;
    }
    
    public String getPropertyAddress() {
        return this.propertyAddress;
    }
    
    public void setPropertyAddress(final String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    
    public String getPropertyAddressText() {
        return this.propertyAddressText;
    }
    
    public void setPropertyAddressText(final String propertyAddressText) {
        this.propertyAddressText = propertyAddressText;
    }
    
    public String getFltNo() {
        return this.fltNo;
    }
    
    public void setFltNo(final String fltNo) {
        this.fltNo = fltNo;
    }
    
    public Integer getIsPrintAirUnionItinerary() {
        return this.isPrintAirUnionItinerary;
    }
    
    public void setIsPrintAirUnionItinerary(final Integer isPrintAirUnionItinerary) {
        this.isPrintAirUnionItinerary = isPrintAirUnionItinerary;
    }
    
    public String getFltTicketNo() {
        return this.fltTicketNo;
    }
    
    public void setFltTicketNo(final String fltTicketNo) {
        this.fltTicketNo = fltTicketNo;
    }
    
    public Integer getTripPurpose() {
        return this.tripPurpose;
    }
    
    public void setTripPurpose(final Integer tripPurpose) {
        this.tripPurpose = tripPurpose;
    }
    
    public String getTripPurposeName() {
        return this.tripPurposeName;
    }
    
    public void setTripPurposeName(final String tripPurposeName) {
        this.tripPurposeName = tripPurposeName;
    }
    
    public String getDestination() {
        return this.destination;
    }
    
    public void setDestination(final String destination) {
        this.destination = destination;
    }
    
    public String getWorkCompanyName() {
        return this.workCompanyName;
    }
    
    public void setWorkCompanyName(final String workCompanyName) {
        this.workCompanyName = workCompanyName;
    }
    
    public String getWorkEmail() {
        return this.workEmail;
    }
    
    public void setWorkEmail(final String workEmail) {
        this.workEmail = workEmail;
    }
    
    public Integer getPetOwner() {
        return this.petOwner;
    }
    
    public void setPetOwner(final Integer petOwner) {
        this.petOwner = petOwner;
    }
    
    public String getDogLicense() {
        return this.dogLicense;
    }
    
    public void setDogLicense(final String dogLicense) {
        this.dogLicense = dogLicense;
    }
    
    public String getDogImmuneLicense() {
        return this.dogImmuneLicense;
    }
    
    public void setDogImmuneLicense(final String dogImmuneLicense) {
        this.dogImmuneLicense = dogImmuneLicense;
    }
    
    public String getDogSpecies() {
        return this.dogSpecies;
    }
    
    public void setDogSpecies(final String dogSpecies) {
        this.dogSpecies = dogSpecies;
    }
    
    public Integer getRenewalPayBank() {
        return this.renewalPayBank;
    }
    
    public void setRenewalPayBank(final Integer renewalPayBank) {
        this.renewalPayBank = renewalPayBank;
    }
    
    public String getRenewalPayBankName() {
        return this.renewalPayBankName;
    }
    
    public void setRenewalPayBankName(final String renewalPayBankName) {
        this.renewalPayBankName = renewalPayBankName;
    }
    
    public String getRenewalPayAccount() {
        return this.renewalPayAccount;
    }
    
    public void setRenewalPayAccount(final String renewalPayAccount) {
        this.renewalPayAccount = renewalPayAccount;
    }
    
    public String getRenewalPayCardholder() {
        return this.renewalPayCardholder;
    }
    
    public void setRenewalPayCardholder(final String renewalPayCardholder) {
        this.renewalPayCardholder = renewalPayCardholder;
    }
    
    public Integer getWithholdBank() {
        return this.withholdBank;
    }
    
    public void setWithholdBank(final Integer withholdBank) {
        this.withholdBank = withholdBank;
    }
    
    public String getWithholdBankName() {
        return this.withholdBankName;
    }
    
    public void setWithholdBankName(final String withholdBankName) {
        this.withholdBankName = withholdBankName;
    }
    
    public String getWithholdCardholder() {
        return this.withholdCardholder;
    }
    
    public void setWithholdCardholder(final String withholdCardholder) {
        this.withholdCardholder = withholdCardholder;
    }
    
    public String getWithholdAccount() {
        return this.withholdAccount;
    }
    
    public void setWithholdAccount(final String withholdAccount) {
        this.withholdAccount = withholdAccount;
    }
    
    public String getUrgencyContact() {
        return this.urgencyContact;
    }
    
    public void setUrgencyContact(final String urgencyContact) {
        this.urgencyContact = urgencyContact;
    }
    
    public String getUrgencyContactMobile() {
        return this.urgencyContactMobile;
    }
    
    public void setUrgencyContactMobile(final String urgencyContactMobile) {
        this.urgencyContactMobile = urgencyContactMobile;
    }
    
    public Integer getRenewalBank() {
        return this.renewalBank;
    }
    
    public void setRenewalBank(final Integer renewalBank) {
        this.renewalBank = renewalBank;
    }
    
    public String getRenewalBankName() {
        return this.renewalBankName;
    }
    
    public void setRenewalBankName(final String renewalBankName) {
        this.renewalBankName = renewalBankName;
    }
    
    public String getRenewalCardholder() {
        return this.renewalCardholder;
    }
    
    public void setRenewalCardholder(final String renewalCardholder) {
        this.renewalCardholder = renewalCardholder;
    }
    
    public String getRenewalAccount() {
        return this.renewalAccount;
    }
    
    public void setRenewalAccount(final String renewalAccount) {
        this.renewalAccount = renewalAccount;
    }
    
    public String getRenewalPayBankAddr() {
        return this.renewalPayBankAddr;
    }
    
    public void setRenewalPayBankAddr(final String renewalPayBankAddr) {
        this.renewalPayBankAddr = renewalPayBankAddr;
    }
    
    public String getRenewalPayBankProvText() {
        return this.renewalPayBankProvText;
    }
    
    public void setRenewalPayBankProvText(final String renewalPayBankProvText) {
        this.renewalPayBankProvText = renewalPayBankProvText;
    }
    
    public String getRenewalPayBankCityText() {
        return this.renewalPayBankCityText;
    }
    
    public void setRenewalPayBankCityText(final String renewalPayBankCityText) {
        this.renewalPayBankCityText = renewalPayBankCityText;
    }
    
    public String getRenewalPayBankAreaText() {
        return this.renewalPayBankAreaText;
    }
    
    public void setRenewalPayBankAreaText(final String renewalPayBankAreaText) {
        this.renewalPayBankAreaText = renewalPayBankAreaText;
    }
}
