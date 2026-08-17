package com.github.m7mas.restaurantreservationservice;

import java.util.Random;

public class Customer {
    private static int counter = 0;

    private int id;
    private String name;
    private String username;

    public Customer(String name) {
        this.id = ++counter;
        this.name = name;
        this.username = "user-" + new Random().nextInt(99_999_999,999_999_999);
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public String getUsername() {return this.username;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
