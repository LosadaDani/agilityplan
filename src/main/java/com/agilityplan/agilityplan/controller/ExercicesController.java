package com.agilityplan.agilityplan.controller;

import com.agilityplan.agilityplan.entity.Exercices;
import com.agilityplan.agilityplan.service.ExercicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercices")
public class ExercicesController {

    @Autowired
    private ExercicesService exercicesService;

    @GetMapping
    public ResponseEntity<List<Exercices>> findAll() {
        return ResponseEntity.ok(exercicesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercices> findById(@PathVariable("id") long idExercices) {
        return exercicesService.findById(idExercices)
                .map(ResponseEntity::ok)
                .orElseGet( () -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Exercices> create(@RequestBody Exercices exercices){
        return new ResponseEntity<>(exercicesService.create(exercices), HttpStatus.CREATED);
    }



}