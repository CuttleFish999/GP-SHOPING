package com.example.demo.Vo;

import java.util.Date;

public class RtnNo {
    private Integer rtnNo;
    private Integer empNo;
    private Integer orderNo;
    private Date rtnDate;
    private String rtnWhy;
    private Integer refundAmount;
//    狀態
    private Integer rtnStatus;

    public RtnNo(Integer rtnNo, Integer empNo, Integer orderNo, Date rtnDate, String rtnWhy, Integer refundAmount, Integer rtnStatus) {
        this.rtnNo = rtnNo;
        this.empNo = empNo;
        this.orderNo = orderNo;
        this.rtnDate = rtnDate;
        this.rtnWhy = rtnWhy;
        this.refundAmount = refundAmount;
        this.rtnStatus = rtnStatus;
    }

    public RtnNo(){

    }

    public Integer getRtnNo() {
        return rtnNo;
    }

    public void setRtnNo(Integer rtnNo) {
        this.rtnNo = rtnNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getRtnDate() {
        return rtnDate;
    }

    public void setRtnDate(Date rtnDate) {
        this.rtnDate = rtnDate;
    }

    public String getRtnWhy() {
        return rtnWhy;
    }

    public void setRtnWhy(String rtnWhy) {
        this.rtnWhy = rtnWhy;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRtnStatus() {
        return rtnStatus;
    }

    public void setRtnStatus(Integer rtnStatus) {
        this.rtnStatus = rtnStatus;
    }
}
