package ru.vsuet.productsinthestore.inmemory;

import ru.vsuet.productsinthestore.domain.Tovar;
import ru.vsuet.productsinthestore.domain.Otdel;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static Storage instance;
    public static Storage getInstance(){
        if(instance==null){
            instance=new Storage();
        }
        return instance;
    }
    private List<Otdel> otdels;
    private Storage(){
        otdels=new ArrayList<>();
        init();
    }
    public List<Otdel> getOtdels(){
        return otdels;
    }
    private void init(){
        Tovar tovar= new Tovar("milk","56p");
        Tovar tovar1=new Tovar("cheez","100p");

        Otdel otdel=new Otdel("Dairy Department",LocalTime.parse("12:00"));
        otdel.addTovar(tovar);
        otdel.addTovar(tovar1);

        Tovar tovar2=new Tovar("tea","120p");
        Tovar tovar3=new Tovar("coffe","220p");

        Otdel otdel1=new Otdel("Grocery",LocalTime.parse("14:00"));
        otdel1.addTovar(tovar2);
        otdel1.addTovar(tovar3);

        otdels.add(otdel);
        otdels.add(otdel1);
    }
}
