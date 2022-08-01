package com.practice.springpractice.Controller;

import com.practice.springpractice.Model.Meal;
import com.practice.springpractice.Model.Order;
import com.practice.springpractice.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/meal")
public class MealController {
    @Autowired
    MealService userService;

    @GetMapping
    public String getUserByName(@RequestParam String name, Model model){
        Meal meal = this.userService.getMealByName(name);
        model.addAttribute("meal",meal); //"user"與html裡呼叫有關
        return "Meal";  //"Meal"與html名稱有關
    }

}
