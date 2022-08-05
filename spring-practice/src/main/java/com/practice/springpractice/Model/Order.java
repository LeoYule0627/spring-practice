package com.practice.springpractice.Model;

import java.util.List;

public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> mealList;

    public Order(int seq, String waiter, List<Meal> meals) {
        this.seq = seq;
        this.waiter = waiter;
        this.mealList = meals;
    }


    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }


    public int getTotalPrice() {
        int totalPrice = 0;
        for(Meal meal: this.getMealList()) {
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {

        this.totalPrice = totalPrice;
    }

}
