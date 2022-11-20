package com.agilityplan.agilityplan.service;

import com.agilityplan.agilityplan.entity.Exercices;
import com.agilityplan.agilityplan.repository.IExercicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExercicesService implements ICRUDService<Exercices>{

    @Autowired
    private IExercicesRepository exercicesRepository;

    @Override
    public List<Exercices> findAll() {
        return exercicesRepository.findAll();
    }

    @Override
    public Optional<Exercices> findById(long id) {
        return exercicesRepository.findById(id);
    }

    @Override
    public Exercices create(Exercices exercices) {
        return exercicesRepository.save(exercices);
    }

    @Override
    public Exercices update(Exercices exercices) {
        return exercicesRepository.save(exercices);
    }

    @Override
    public void delete(long id) {
        exercicesRepository.deleteById(id);
    }
}
