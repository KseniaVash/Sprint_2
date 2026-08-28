package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
            totalPrice += item.getAmount() * item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
            double itemCost = item.getAmount() * item.getPrice();
            double discountAmount = itemCost * item.getDiscount();
            totalPrice += itemCost - discountAmount;
        }
        return totalPrice;
    }
    public double getTotalVegetarianPriceWithoutDiscount() {
        double vegetarianTotalPrice = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                vegetarianTotalPrice += item.getAmount() * item.getPrice();
            }
        }
        return vegetarianTotalPrice;
    }
}