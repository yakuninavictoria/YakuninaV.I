/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаритный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
public class Test {
    public static void main(String[] args){
        Supermarket a= new Supermarket ("Игрушки","Кукла","Россия","2600","СитиОпт");
        System.out.println(a);
        Market a1=new Market(a.getNameotdela(),a.getName(),a.getCuntry(),a.getRetaulRrice(),a.getNamesourse());
        Toys a11=new Toys(a1.getNameotdela(),a1.getName(),a1.getCuntry(),a1.getRetaulRrice(),a1.getNamesourse(),"6+","плюшевый");
        System.out.println(a11);
        Fruit a12=new Fruit("Продуктовый","Абрикосы",a1.getCuntry(),a1.getRetaulRrice(),a1.getNamesourse(),"3 недели","от -0,5 до +0,5");
        System.out.println(a12);
        GabarityTovarov a13=new GabarityTovarov(a1.getNameotdela(),"Шкаф",a1.getCuntry(),a1.getRetaulRrice(),a1.getNamesourse(),"2","1,5","1,7");
        System.out.println(a13);

        String newTovar= a1.add();
        a1.show();
    }
}
