package com.example.demo.Vo;

import java.util.Date;

public class Product {

    private Integer proNo;
    private String proName;
    private String proMean;
    private Integer proPrice;
    private Integer proQuantity;
    private Byte[] proImg;
    private Date proReleaseDateTime;
    private Boolean proStatus;

    public Product(Integer proNo, String proName, String proMean, Integer proPrice, Integer proQuantity, Byte[] proImg, Date proReleaseDateTime, Boolean proStatus) {
        this.proNo = proNo;
        this.proName = proName;
        this.proMean = proMean;
        this.proPrice = proPrice;
        this.proQuantity = proQuantity;
        this.proImg = proImg;
        this.proReleaseDateTime = proReleaseDateTime;
        this.proStatus = proStatus;
    }
    public Product(){

    }

    public Integer getProNo() {
        return proNo;
    }

    public void setProNo(Integer proNo) {
        this.proNo = proNo;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProMean() {
        return proMean;
    }

    public void setProMean(String proMean) {
        this.proMean = proMean;
    }

    public Integer getProPrice() {
        return proPrice;
    }

    public void setProPrice(Integer proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProQuantity() {
        return proQuantity;
    }

    public void setProQuantity(Integer proQuantity) {
        this.proQuantity = proQuantity;
    }

    public Byte[] getProImg() {
        return proImg;
    }

    public void setProImg(Byte[] proImg) {
        this.proImg = proImg;
    }

    public Date getProReleaseDateTime() {
        return proReleaseDateTime;
    }

    public void setProReleaseDateTime(Date proReleaseDateTime) {
        this.proReleaseDateTime = proReleaseDateTime;
    }

    public Boolean getProStatus() {
        return proStatus;
    }

    public void setProStatus(Boolean proStatus) {
        this.proStatus = proStatus;
    }
}