/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаритный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
public class GabarityTovarov extends Fruit{
    private String height;
    private String width;
    private String length;

    public GabarityTovarov(String nameotdela,String name, String cuntry,String retaulRrice,String namesourse,String height,String width,String length){
        super(nameotdela,name,cuntry,retaulRrice,namesourse,height,width);
        this.height=height;
        this.width=width;
        this.length=length;}

    public String getHeight(){
        return  height;
    }
    public String getWidth(){
        return  width;
    }
    public String getLength(){
        return length;
    }
    public void setHeight(){
        this.height=height;
    }
    public void setWidth(){
        this.width=width;
    }
    public void setLength(){
        this.length=length;
    }
    @Override
    public String toString(){
        return "Название товара: "+getName()+'\n'+"Страна-производитель: "+getCuntry()+
                '\n'+"Высота: "+height+"м."+'\n'+"Ширина: "+width+"м."+'\n'+"Длина: "+length+"м."+'\n';
    }//в условии вводим название товара и ее размеры
}
