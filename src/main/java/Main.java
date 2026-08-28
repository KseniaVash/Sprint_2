import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApples = new Apple(10, 50.0, "red");
        Food greenApples = new Apple(8, 60.0, "green");
        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        double totalWithoutDiscount = cart.getTotalSumWithoutDiscount();
        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);

        double totalWithDiscount = cart.getTotalSumWithDiscount();
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);

        double vegetarianTotal = cart.getTotalVegetarianSum();
        System.out.println("Сумма вегетарианских продуктов: " + vegetarianTotal);
    }
}

