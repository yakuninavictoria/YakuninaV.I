package ru.vsuet.productsinthestore.repository;

import ru.vsuet.productsinthestore.domain.Tovar;
import ru.vsuet.productsinthestore.inmemory.Storage;

import java.util.List;
import java.util.stream.Collectors;

public class InMemoryTovarRepository implements Repository<Tovar>{
    private List<Tovar> tovars;

    public InMemoryTovarRepository(){
        tovars=Storage.getInstance().getOtdels().stream()
                .flatMap(o->o.getTovars().stream())
                .collect(Collectors.toList());
    }
    @Override
    public Tovar find(String name){
        return tovars.stream()
                .filter(t->t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(Tovar source){
        throw new IllegalStateException("Method is not supported");
    }
    @Override
    public void remove(Tovar target){
        throw new IllegalStateException("Method is not supported");
    }
    @Override
    public List<Tovar> list(){
        return tovars;
    }
}
