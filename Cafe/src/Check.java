import java.util.ArrayList;

public class Check {
    private double checkPrice;

    public double getCheckPrice() {
        return checkPrice;
    }

    public Check(ArrayList<Order> orders) {
        double pizzaPrice = 0;
        double drinksPrice = 0;
        int pizzaCount = 0;
        int drinksCount = 0;
        for (Order order : orders) {
            Class<? extends Product> productClass = order.getProduct().getClass();
            Product product = order.getProduct();
            int price = product.getPrice();
            int amount = order.getAmount();
            if (productClass == Pizza.class) {
                for (int pizzaIndex = 0; pizzaIndex < amount; pizzaIndex++) {
                    pizzaCount++;
                    if (pizzaCount == 5) {
                        pizzaCount = 0;
                    } else {
                        pizzaCount += price;
                    }
                }
                drinksPrice += price * amount;
                if (price > 2) {
                    drinksCount += amount;
                }
            }
        }
        checkPrice = drinksPrice + pizzaPrice;
        double ratio= 1;
        if (checkPrice > 50) {
            ratio = 0.8;
        }
        for (Order order : orders) {
            int amount = order.getAmount();
            int price = order.getProduct().getPrice();
            order.setPrice(amount * price * ratio);
        }
        checkPrice *= ratio;
        if (drinksCount > 2) {
            orders.stream().filter(order -> {
                Product product = order.getProduct();
                Class<? extends Product> productClass = product.getClass();
                int price = product.getPrice();
                return productClass == Drinks.class && price > 2;
            }).forEach(order -> {
                double price = order.getPrice();
                double newPrice = price * 0.85;
                order.setPrice(newPrice);
                checkPrice -= price - newPrice;
            });
        }
    }
}
