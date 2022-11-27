package com.agilityplan.agilityplan.service;

import com.agilityplan.agilityplan.entity.TypeExercices;
import com.agilityplan.agilityplan.repository.ITypeExercicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeExercicesService implements ICRUDService<TypeExercices>{

    @Autowired
    private ITypeExercicesRepository typeExercicesRepository;

    @Override
    public List<TypeExercices> findAll() {
        return typeExercicesRepository.findAll();
    }

    @Override
    public Optional<TypeExercices> findById(long id) {
        return typeExercicesRepository.findById(id);
    }

    @Override
    public TypeExercices create(TypeExercices typeExercices) {
        return typeExercicesRepository.save(typeExercices);
    }

    @Override
    public TypeExercices update(TypeExercices typeExercices) {
        return typeExercicesRepository.save(typeExercices);
    }

    @Override
    public void delete(long id) {
        typeExercicesRepository.deleteById(id);
    }
}
