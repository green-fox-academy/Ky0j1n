package com.greenfox.greenfoxapp.controller;

import com.greenfox.greenfoxapp.model.Drink;
import com.greenfox.greenfoxapp.model.Food;
import com.greenfox.greenfoxapp.model.Fox;
import com.greenfox.greenfoxapp.model.Tricks;
import com.greenfox.greenfoxapp.service.FoxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
FoxServices foxServices;
Fox currentFox;
Tricks tricks = new Tricks();

@Autowired
public MainController(FoxServices foxServices) {
    this.foxServices = foxServices;
}
    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String getToTheFox(Model model, String name) {
        foxServices.addFox(name);
        currentFox = foxServices.getFox(name);
        model.addAttribute("fox", foxServices.getFox(name));
        return "index";
    }

    @GetMapping("/nutrition")
    public String getNutritionOptions(Model model) {
    model.addAttribute("foodList", foxServices.getFoodList());
    model.addAttribute("drinkList", foxServices.getDrinkList());
    return "nutrition";
    }

    @PostMapping("/nutrition")
    public String setNutritionOptions(Model model,Drink drink, Food food) {
        currentFox.setDrink(drink);
        currentFox.setFood(food);
        model.addAttribute("fox",currentFox);
    return "index";
    }

    @GetMapping("/trickCenter")
    public String getTrickOptions(Model model) {

        model.addAttribute("tricksList", tricks.getTricksList());

        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String setTrickOptions(Model model, String learn ) {
        currentFox.addTrick(learn);
        model.addAttribute("fox",currentFox);
        model.addAttribute("tricksList", currentFox.getTricks());
        return "index";
    }



}
