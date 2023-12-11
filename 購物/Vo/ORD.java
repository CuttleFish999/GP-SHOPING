package com.example.demo.Vo;

import java.util.Date;

public class ORD {
    private Integer ordNo;
    private Integer memNo;
    private Date ordTime;
    private String ordShip;
    private String ordShippingAds;
    private Integer ordPrice;
    private Integer ordStatus;
    //狀態
    private Date OrdShippingTime;

    public ORD(Integer ordNo, Integer memNo, Date ordTime, String ordShip, String ordShippingAds, Integer ordPrice, Integer ordStatus, Date ordShippingTime) {
        this.ordNo = ordNo;
        this.memNo = memNo;
        this.ordTime = ordTime;
        this.ordShip = ordShip;
        this.ordShippingAds = ordShippingAds;
        this.ordPrice = ordPrice;
        this.ordStatus = ordStatus;
        OrdShippingTime = ordShippingTime;
    }

    public ORD(){

    }

    public Integer getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(Integer ordNo) {
        this.ordNo = ordNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public Date getOrdTime() {
        return ordTime;
    }

    public void setOrdTime(Date ordTime) {
        this.ordTime = ordTime;
    }

    public String getOrdShip() {
        return ordShip;
    }

    public void setOrdShip(String ordShip) {
        this.ordShip = ordShip;
    }

    public String getOrdShippingAds() {
        return ordShippingAds;
    }

    public void setOrdShippingAds(String ordShippingAds) {
        this.ordShippingAds = ordShippingAds;
    }

    public Integer getOrdPrice() {
        return ordPrice;
    }

    public void setOrdPrice(Integer ordPrice) {
        this.ordPrice = ordPrice;
    }

    public Integer getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(Integer ordStatus) {
        this.ordStatus = ordStatus;
    }

    public Date getOrdShippingTime() {
        return OrdShippingTime;
    }

    public void setOrdShippingTime(Date ordShippingTime) {
        OrdShippingTime = ordShippingTime;
    }
}
