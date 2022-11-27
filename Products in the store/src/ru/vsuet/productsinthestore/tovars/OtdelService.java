package ru.vsuet.productsinthestore.tovars;

import ru.vsuet.productsinthestore.domain.Otdel;
import ru.vsuet.productsinthestore.repository.Repository;

import java.util.List;

public class OtdelService implements Service<Otdel> {
    private final Repository<Otdel> repository;
    public OtdelService(Repository<Otdel> repository){
        this.repository=repository;
    }
    @Override
    public Otdel getByNameOt(String Nameot){
        return repository.find(Nameot);
    }
    @Override
    public List<Otdel> getAll(){
        return repository.list();
    }
    @Override
    public void save(Otdel source){
        repository.save(source);
    }
}
