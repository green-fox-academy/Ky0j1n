package com.greenfox.nemdemo.controller;

import com.greenfox.nemdemo.model.ShopItem;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class WebshopController {

    List<ShopItem> shopItems = new ArrayList<>();

    public WebshopController() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5, "Clothes and Shoes"));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "Electronics"));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "Beverages and Snacks"));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100, "Beverages and Snacks"));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1, "Clothes and Shoes"));
    }

//   together
    @GetMapping("/webshop")
    public String landing(Model model) {
        model.addAttribute("itemsList", shopItems);
        return "index";
    }

//    together
    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        List<ShopItem> onlyAvailable = shopItems.stream()
                .filter(s -> s.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
        model.addAttribute("itemsList", onlyAvailable);
        return "index";
    }

//    Gyuri
    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        List<ShopItem> cheapestFirst = shopItems.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", cheapestFirst);
        return "index";
    }

//    Menya
    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> containsNike = shopItems
                .stream()
                .filter(s -> s.getDescription()
                        .toLowerCase()
                        .contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", containsNike);
        if (containsNike.isEmpty()) {
            model.addAttribute("noItemMessage", "No Nike found");
        } else {
            model.addAttribute("noItemMessage", "");
        }
        return "index";
    }

//    @GetMapping("/most-expensive-available")
//    public String mostExpensiveAvailable(Model model) {
//        List<ShopItem> availableItems = shopItems.stream()
//                .filter(s -> s.getQuantityOfStock() != 0)
//                .sorted(Comparator.comparing(ShopItem::getPrice))
//                .collect(Collectors.toList());
//        ShopItem mostExpensive = availableItems.stream().findFirst().get();
//
//        model.addAttribute("itemsList", mostExpensive);
//        return "index";
//    }

//    Peter Varga
    @GetMapping("/most-expensive-available")
    public String mostExpensiveAvailable(Model model) {
        List<ShopItem> mostExpensiveItem = new ArrayList();
        mostExpensiveItem.add(shopItems.stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice))
                .get());
        model.addAttribute("itemsList", mostExpensiveItem);
        return "index";
    }

//    Andris
    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        Double averageStock = shopItems
                .stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average()
                .orElse(0);
        model.addAttribute("itemsList", averageStock);
        return "average-stock";
    }

//    Peter Varga
    @PostMapping("/search")
    public String searchBar(Model model, @RequestParam String search) {
        List<ShopItem> listOfSearchedItems = shopItems
                .stream()
                .filter(s -> (s.getDescription() + s.getName())
                        .toLowerCase()
                        .contains(search.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", listOfSearchedItems);
        if (listOfSearchedItems.isEmpty()) {
            model.addAttribute("noItemMessage", "No item found");
        } else {
            model.addAttribute("noItemMessage", "");
        }
        return "index";

    }

    @GetMapping("/clothes-and-shoes")
    public String clothesAndShoesTypeSearch(Model model) {
        List<ShopItem> listOfSearchedItems = shopItems
                .stream()
                .filter(s -> (s.getType())
                        .toLowerCase()
                        .contains("Clothes and Shoes".toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", listOfSearchedItems);
        if (listOfSearchedItems.isEmpty()) {
            model.addAttribute("noItemMessage", "No item found");
        } else {
            model.addAttribute("noItemMessage", "");
        }
        return "index";

    }

    @GetMapping("/electronics")
    public String electronicsTypeSearch(Model model) {
        List<ShopItem> listOfSearchedItems = shopItems
                .stream()
                .filter(s -> (s.getType())
                        .toLowerCase()
                        .contains("Electronics".toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", listOfSearchedItems);
        if (listOfSearchedItems.isEmpty()) {
            model.addAttribute("noItemMessage", "No item found");
        } else {
            model.addAttribute("noItemMessage", "");
        }
        return "index";

    }

    @GetMapping("/beverages-and-snacks")
    public String beveragesAndSnacksTypeSearch(Model model) {
        List<ShopItem> listOfSearchedItems = shopItems
                .stream()
                .filter(s -> (s.getType())
                        .toLowerCase()
                        .contains("Beverages and Snacks".toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("itemsList", listOfSearchedItems);
        if (listOfSearchedItems.isEmpty()) {
            model.addAttribute("noItemMessage", "No item found");
        } else {
            model.addAttribute("noItemMessage", "");
        }
        return "index";

    }
}
