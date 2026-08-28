import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100.0);
        Food appleRed = new Apple(10, 50.0, Colour.RED);
        Food appleGreen = new Apple(8, 60.0, Colour.GREEN);
        Food[] foods = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}