package model;

public class Meat extends Food { // Теперь Meat наследуется от Food

    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false; // Мясо не вегетарианское
    }
}

