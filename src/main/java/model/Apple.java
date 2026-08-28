package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        // Используем константу для цвета
        if (colour.equalsIgnoreCase(Colour.RED)) {
            return Discount.APPLE_DISCOUNT;
        }
        return super.getDiscount(); // Или просто return 0.0;
    }
}