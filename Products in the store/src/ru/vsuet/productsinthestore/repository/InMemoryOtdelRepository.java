package ru.vsuet.productsinthestore.repository;

import ru.vsuet.productsinthestore.domain.Otdel;
import ru.vsuet.productsinthestore.inmemory.Storage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOtdelRepository implements Repository<Otdel>{
    private List <Otdel> otdels;
    public InMemoryOtdelRepository(){
        otdels=Storage.getInstance().getOtdels();
    }

    @Override
    public Otdel find(String name){
        return  otdels.stream()
                .filter(o->o.getNameot().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(Otdel source){
        otdels.add(source);
    }
    @Override
    public void remove(Otdel target){
        otdels.removeIf(o->o.getNameot().equalsIgnoreCase(target.getNameot()));
    }
    @Override
    public List<Otdel> list(){
        return new ArrayList<>(otdels);
    }
}
