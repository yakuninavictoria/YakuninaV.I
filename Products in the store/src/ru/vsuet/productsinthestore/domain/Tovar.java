package ru.vsuet.productsinthestore.domain;

public class Tovar {
    private String name;
    private String price;
    public Tovar(String name,String price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Tovar:{"+
                "name='"+name+'\''+
                ", price="+price +'}';
    }
}
