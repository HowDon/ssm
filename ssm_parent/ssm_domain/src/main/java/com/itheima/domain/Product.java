package com.itheima.domain;

public class Product {
    /*CREATE TABLE product(
id number(9) PRIMARY KEY ,
productNum VARCHAR2(50) ,
productName VARCHAR2(50),
cityName VARCHAR2(50),
--比date精确日期类型--默认秒后6位
departureTime TIMESTAMP(0),
productPrice NUMBER(8,2),
productDesc VARCHAR2(500),
productStatus number(2)
)*/
    private int number;
    private String productNum;
    private String productName;
    private String cityName;
    private String departureTime;
    private String productPrice;
    private String productDesc;
    private String productStatus;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}
