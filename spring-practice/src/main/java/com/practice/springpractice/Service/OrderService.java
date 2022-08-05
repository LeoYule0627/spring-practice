package com.practice.springpractice.Service;

import com.practice.springpractice.Model.Meal;
import com.practice.springpractice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Order> orderList;

    public OrderService() {
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("hamburger", 100, "This is delicious"));
        mealList1.add(new Meal("ice_cream", 200, "This is delicious"));

        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("fries", 100, "This is delicious"));
        mealList2.add(new Meal("coca", 200, "This is delicious"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1, "Leo", mealList1));
        this.orderList.add(new Order(2, "Leo", mealList2));
    }

    public Order getOrderBySeq(int seq) {
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getSeq() == seq) {
                return this.orderList.get(i);
            }
        }
        return null;
    }

    public int getIncome(){
        int income = 0;
        for(int i=0; i<this.orderList.size();i++){
            income += orderList.get(i).getTotalPrice();
        }
        return  income;
    }

    public List<Order> getOrderList(){
        return this.orderList;
    }
}
