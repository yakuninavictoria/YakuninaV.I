/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаритный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
public class Supermarket {
    private String nameotdela;
    private String name;
    private String cuntry;
    private String retaulRrice;
    private String namesourse;
    public Supermarket(String nameotdela, String name, String cuntry, String retaulRrice, String namesourse){
        this.nameotdela=nameotdela;
        this.name=name;
        this.cuntry=cuntry;
        this.retaulRrice=retaulRrice;
        this.namesourse=namesourse;
    }
    public String getNameotdela(){return nameotdela;}
    public String getName(){
        return name;
    }
    public String getCuntry(){
        return cuntry;
    }
    public String getRetaulRrice(){
        return retaulRrice;
    }
    public String getNamesourse(){
        return namesourse;
    }
    public void setNameotdela(String nameotdela){
        this.nameotdela=nameotdela;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCuntry(String cuntry){
        this.cuntry=cuntry;
    }
    public void setRetaulRrice(String retaulRrice){
        this.retaulRrice=retaulRrice;
    }
    public void setNamesourse(String nameotdela){
        this.namesourse=namesourse;
    }
    @Override
    public String toString(){
        return "Название отдела: "+nameotdela+"\n"+"Название товара: "+name+"\n"
                +"Страна-производитель: "+cuntry+"\n"+"Розничная цена: "+retaulRrice+" рублей"+"\n"+"Поставщик: "+namesourse+"\n";
    }
}

