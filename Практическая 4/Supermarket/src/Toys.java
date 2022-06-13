import javax.management.StringValueExp;
/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаитный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
public class Toys extends Supermarket{
    private String vozgr;
    private String type;

    public Toys(String nameotdela, String name, String cuntry, String retaulRrice, String namesourse, String vozgr,String type){
        super(nameotdela, name,cuntry,retaulRrice,namesourse);
        this.vozgr=vozgr;
        this.type=type;
    }

    public  String getVozgr(){
        return vozgr;
    }
    public String getType(){
        return type;
    }
    public void setVozgr(String vozgr){
        this.vozgr=vozgr;
    }
    public void setType(String type){
        this.type=type;
    }
    @Override
    public String toString(){
     return "Название товара: "+getName()+'\n'+"Страна-производитель: "+getCuntry()+
             '\n'+"Возрастная группа: "+vozgr+'\n'+"Тип: "+type+'\n';
    }
}
