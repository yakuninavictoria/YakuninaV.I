/* Продажа товаров супермаркета.Создать родительский класс
 "Супермаркет"(название отдела,название товара,страна-производитель,розничная цена,поставщик)
 и дочерние классы:
 -"Игрушки"(возрастная группа,тип);
 -"Фрукты"(max время хранения,температура хранения);
 -"Габаритный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара
 и методом печати списка товаров.
*/
import java.io.*;
import java.util.Scanner;
public class Market extends Supermarket{
    public Market(String nameotdela, String name, String cuntry, String retaulRrice, String namesourse){
        super(nameotdela,name,cuntry,retaulRrice,namesourse);
    }

    public void show(){
        try{
            File file=new File("Market.txt");
            FileReader fr=new FileReader(file);
            BufferedReader reader=new BufferedReader(fr);
            String line=reader.readLine();
            System.out.println("Список супермаркета: ");
            while (line !=null) {
                System.out.println(line+"\n");
                line=reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
   public String add(){
        Scanner in= new Scanner(System.in);
       System.out.println("Введите название товара: ");
       String newTovar=in.nextLine();
       try(FileWriter writer=new FileWriter("Market.txt",true)){
           writer.write(newTovar);
           writer.append('\n');
           writer.flush();
       }catch (IOException ex){
           System.out.println(ex.getMessage());
       }
       return newTovar;
   }
}
