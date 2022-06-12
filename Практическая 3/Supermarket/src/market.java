/*Supermarket:
Свойства:
- nameotdela - название отдела; - конструктор
- productCode - Код товара; - конструктор
- name - Наименование товара; - конструктор
- cuntry - Страна-производитель; - конструктор
- retailPrice - Розничная цена ; - конструктор
- namesourse - Поставщик ;
*/
public class market {
    public static void main(String[] args){
        Supermarket c=new Supermarket("Продуктовый","4607102692988","Хлеб","Россия","26");
        c.setNamesourse("Хлебозавод №2");
        System.out.println(c);
    }
}
