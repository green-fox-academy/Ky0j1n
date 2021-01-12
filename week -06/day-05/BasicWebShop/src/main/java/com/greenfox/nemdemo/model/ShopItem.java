package com.greenfox.nemdemo.model;

public class ShopItem {
    String name;
    String description;
    Double price;
    Integer quantityOfStock;
    String type;
    String currency;

    public ShopItem(String name, String description, Double price, Integer quantityOfStock, String type, String currency) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
        this.currency = currency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void change(ShopItem item) {
        if(item.getCurrency().equals("HUF")) {
            Double neoPrice = item.getPrice() / 361;
            item.setPrice(neoPrice);
            item.setCurrency("EUR");

        } else if (item.getCurrency().equals("EUR"))
        {
            Double neoPrice = item.getPrice() * 361;
            item.setPrice(neoPrice);
            item.setCurrency("HUF");
        }
    }
}
