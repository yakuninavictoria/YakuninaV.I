package ru.vsuet.productsinthestore.tovars;

import java.util.List;

public interface Service<T> {
 T getByNameOt(String NameOt);
 List<T> getAll();
 void save(T source);
}
