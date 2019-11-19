package com.example.microservicesimpleconsumermovie.domain;

/**
 * @Author: Seth
 * @Description:
 * @Date: Created in 16:42 2019/11/19
 */

public class User {
    private Integer id;
    private String username;
    private String name;
    private Integer age;
    private int balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
