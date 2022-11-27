package ru.vsuet.productsinthestore.view;

import ru.vsuet.productsinthestore.domain.Otdel;
import ru.vsuet.productsinthestore.tovars.Service;

import java.util.Scanner;

public class Menu  {
    Scanner keyboard=new Scanner(System.in);

    private final Service<Otdel> otdelService;
    public Menu(Service<Otdel> otdelService){
        this.otdelService=otdelService;
    }
    public void draw(){
        System.out.println("******MENU******\n");
        System.out.println("1 - list of otdels");
        System.out.println("2 - get otdel by name");
        System.out.println("9 - Exit");
        execute();
    }
    private void execute(){
        int command=keyboard.nextInt();
        switch (command){
            case 1->drawObjectList();
            case 2->drawSingleObject();
            case 9->System.exit(0);
            default-> throw new IllegalArgumentException("No command found");
        }
    }
    private void drawObjectList() {
        System.out.println("------Otdels list------");
        otdelService.getAll().forEach(System.out::println);
    }
    private void drawSingleObject() {
        System.out.println("Enter otdel name: ");
        String NameOt=keyboard.next();
        System.out.println("------Single otdel------");
        Otdel otdel=otdelService.getByNameOt(NameOt);
        System.out.println(NameOt);
    }
}