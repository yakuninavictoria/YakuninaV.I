/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаитный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
public class Fruit extends Toys{
    private String maxTime;
    private String tempHr;

    public Fruit(String nameotdela, String name, String cuntry, String retaulRrice, String namesourse,String maxTime,String tempHr){
        super(nameotdela, name ,cuntry,retaulRrice,namesourse,maxTime,tempHr);
        this.maxTime=maxTime;
        this.tempHr=tempHr;
    }


    public String getMaxTime(){
        return maxTime;
    }
    public String getTempHr(){
        return tempHr;
    }
    public void setMaxTime(){
        this.maxTime=maxTime;
    }
    public void setTempHr(){
        this.tempHr=tempHr;
    }
    @Override
    public String toString(){
        return "Название отдела: "+getNameotdela()+'\n'+"Название товара: "+getName()+'\n'+"Страна-производитель: "+getCuntry()+
                '\n'+"Максимальное время хранения:"+maxTime+'\n'+"Температура хранения: "+tempHr+" °С "+'\n';
    }
}
