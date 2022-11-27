package com.agilityplan.agilityplan.controller;

import com.agilityplan.agilityplan.entity.TypeExercices;
import com.agilityplan.agilityplan.service.TypeExercicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/api/type_exercices")
public class TypeExercicesController {

    @Autowired
    private TypeExercicesService typeExercicesService;

    @GetMapping
    public ResponseEntity<List<TypeExercices>> findAll() {
        return ResponseEntity.ok(typeExercicesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeExercices> findById(@PathVariable("id") long idTypeExercices) {
        return typeExercicesService.findById(idTypeExercices)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TypeExercices> create (@Valid @RequestBody TypeExercices typeExercices){
        return new ResponseEntity<>(typeExercicesService.create(typeExercices), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<TypeExercices> update (@Valid @RequestBody TypeExercices typeExercices){
        return typeExercicesService.findById(typeExercices.getIdTypeExercices())
                .map(t -> ResponseEntity.ok(typeExercicesService.update(typeExercices)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TypeExercices> delete (@PathVariable("id") long idTypeExercices){
        return typeExercicesService.findById(idTypeExercices)
                .map(t -> {
                    typeExercicesService.delete(idTypeExercices);
                    return ResponseEntity.ok(t);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
