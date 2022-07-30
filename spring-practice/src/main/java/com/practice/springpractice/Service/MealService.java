package com.practice.springpractice.Service;

import com.practice.springpractice.Model.Meal;
import com.practice.springpractice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {

    List<Meal> menuList;
    List<Order> orderList;
    public MealService(){
        this.menuList = new ArrayList<>();
        this.menuList.add(new Meal("hamburger",100,"This is delicious"));
        this.menuList.add(new Meal("ice cream",200,"This is delicious"));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,2000,"Leo",menuList));
        this.orderList.add(new Order(2,4000,"Leo",menuList));
    }
    public Meal getMealByName(String name) {
        for(int i=0;i<this.menuList.size();i++){
            if(this.menuList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.menuList.get(i);
            }
        }
        return null;
    }

    public Order getUserByOrder(int seq) {
        for(int i=0;i<this.orderList.size();i++){
                if(this.orderList.get(i).getSeq()==seq){
                    return this.orderList.get(i);
                }
            }
        return null;
    }

    public int getTotal(){
        int total = 0;
        for(int i=0;i<this.orderList.size();i++){
            total += orderList.get(i).getTotalPrice();
            }
        return total;
    }
    public List<Order> getOrderList(){
            return this.orderList;
    }
}
