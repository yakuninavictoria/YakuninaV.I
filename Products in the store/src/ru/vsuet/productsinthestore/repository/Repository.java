package ru.vsuet.productsinthestore.repository;

import java.util.List;

public interface Repository<P> {
    P find(String name);
    void save (P source);
    void remove(P target);
    List<P> list();
}

