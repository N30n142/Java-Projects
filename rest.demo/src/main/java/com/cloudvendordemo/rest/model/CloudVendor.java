package com.cloudvendordemo.rest.model;

public class CloudVendor {

    private String vendorId;

    private String vendorName;

    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(){

    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber){
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;

    }

    public String getvendorId(){
        return vendorId;

    }
    public void setVendorId(String vendorId){
        this.vendorId = vendorId;
    }
    public String getvendorName(){
        return vendorName;

    }
    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }
    public String getvendorAddress(){
        return vendorAddress;

    }
    public void setVendorAddress(String vendorAddress){
        this.vendorAddress = vendorAddress;
    }
    public String getvendorPhoneNumber(){
        return vendorPhoneNumber;

    }
    public void setVendorPhoneNumber(String vendorPhoneNumber){
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
    
}
