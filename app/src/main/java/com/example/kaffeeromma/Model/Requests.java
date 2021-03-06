package com.example.kaffeeromma.Model;

import java.util.List;

public class Requests {
    private String phone;
    private String address;
    private String total;
    private String status;
    private String name;
    private List<Order> foods;


    public Requests(String phone, String address, String total , String name, List<Order> foods) {
        this.phone = phone;
        this.address = address;
        this.total = total;
        this.name = name;
        this.foods = foods;
        this.status = "0";
    }

    public Requests(){

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }

    public String getStatus() {
        return "0";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
