package com.example.demo.Vo;

public class OrderDetail {
    private Integer ordNo;
    private Integer proNo;
    private Integer dtlQty;
    private Integer dtlPrice;

    public OrderDetail(Integer ordNo, Integer proNo, Integer dtlQty, Integer dtlPrice) {
        this.ordNo = ordNo;
        this.proNo = proNo;
        this.dtlQty = dtlQty;
        this.dtlPrice = dtlPrice;
    }

    public OrderDetail(){

    }

    public Integer getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(Integer ordNo) {
        this.ordNo = ordNo;
    }

    public Integer getProNo() {
        return proNo;
    }

    public void setProNo(Integer proNo) {
        this.proNo = proNo;
    }

    public Integer getDtlQty() {
        return dtlQty;
    }

    public void setDtlQty(Integer dtlQty) {
        this.dtlQty = dtlQty;
    }

    public Integer getDtlPrice() {
        return dtlPrice;
    }

    public void setDtlPrice(Integer dtlPrice) {
        this.dtlPrice = dtlPrice;
    }
}
