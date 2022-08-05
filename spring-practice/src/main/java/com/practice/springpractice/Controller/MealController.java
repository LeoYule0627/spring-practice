package com.practice.springpractice.Controller;

import com.practice.springpractice.Model.Meal;
import com.practice.springpractice.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/meal")
public class MealController {
    @Autowired
    private MealService mealService;

    @GetMapping
    public String getMealByName(@RequestParam String name, Model model) {
        Meal meal = this.mealService.getMealByName(name);
        model.addAttribute("meal", meal); //"user"與html裡呼叫有關
        return "meal";  //"Meal"與html名稱有關
    }

}