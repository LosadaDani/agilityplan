package com.agilityplan.agilityplan.service;

import java.util.List;
import java.util.Optional;

public interface ICRUDService<T>{
    List<T> findAll();
    Optional<T> findById(long id);
    T create(T model);
    T update(T model);
    void delete(long id);
}
