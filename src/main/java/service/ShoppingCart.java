package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double getTotalSumWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double itemPrice = item.getAmount() * item.getPrice();
            total += itemPrice;
        }
        return total;
    }
    public double getTotalSumWithDiscount() {
        double total = 0.0;

        for (Food item : items) {
            double fullPrice = item.getAmount() * item.getPrice();
            double discountPercent = getDiscount();
            double finalPrice = fullPrice * (1.0 - discountPercent / 100.0);
            total += finalPrice;
        }
        return total;
    }
    private double getDiscount() {
        return 0;
    }
    public double getTotalVegetarianSum() {
        double total = 0.0;
        for (Food item : items) {
            // Проверяем, является ли продукт вегетарианским
            if (item.isVegetarian()) {
                double itemPrice = item.getAmount() * item.getPrice();
                total += itemPrice;
            }
        }
        return total;
    }
}