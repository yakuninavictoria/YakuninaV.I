import java.util.ArrayList;
import java.util.Collections;

public class Menu {
    public ArrayList<Product> menuList = new ArrayList<>();
    public Menu(){
        Pizza pizza=new Pizza(80,"Margarita");
        Pizza pizza1=new Pizza(90,"Pepperoni");
        Pizza pizza2=new Pizza(73,"Hawaiian");
        Pizza pizza3=new Pizza(77,"4 cheeses");
        Drinks drinks=new Drinks(50,"Coca cola");
        Drinks drinks1=new Drinks(44,"Water");
        Drinks drinks2=new Drinks(40,"Juice");
        Collections.addAll(menuList,pizza,pizza1,pizza2,pizza3,drinks,drinks1,drinks2);
    }
}
