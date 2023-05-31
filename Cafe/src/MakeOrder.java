import java.util.ArrayList;
import java.util.Scanner;

public class MakeOrder {
    public void make() {
        Menu menu = new Menu();
        ArrayList<Product> menuList = menu.menuList;
        ArrayList<Order> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int code;
        while (true) {
            System.out.println("8 - Get a check");
            System.out.println("9 - Exit");
            for (int productCode=1;productCode<=menuList.size();productCode
            ++){
                Product menuItem=menuList.get(productCode-1);
                System.out.println(productCode-1+". "+menuItem);
             }
                System.out.println("Select the product number : ");
                code = scanner.nextInt();
                if (code == 9) {
                    break;
                }
                if (code == 8) {
                    System.out.println("Your check : ");
                    Check check = new Check(orders);
                    double checkPrice = check.getCheckPrice();
                    orders.forEach(System.out::println);
                    System.out.println("Total to be paid : " + checkPrice);
                    orders.clear();
                    break;
                }
                if (code>=0 && code <= menuList.size()+1) {
                    Product MenuItem = menuList.get(code);
                    System.out.println("Select amount : ");
                    int amount = scanner.nextInt();
                    if (amount < 0) {
                        System.out.println("Error");
                    } else {
                        Order order0 = orders.stream().filter(order -> {
                            Product cartProduct = order.getProduct();
                           return cartProduct.equals(MenuItem);
                        }).findFirst().orElse(null);
                        if (order0 != null) {
                            int Amount = order0.getAmount();
                            order0.setAmount(Amount + amount);
                        } else {
                            Order order = new Order(amount,MenuItem);
                            orders.add(order);
                        }
                    }
                } else {
                    System.out.println("There is no such product");
                }
            }
        }
    }