package com.agilityplan.agilityplan.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="exercices")
public class Exercices {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idExercices;

    @NotNull(message="El nombre no puede ser nulo")
    @NotBlank(message="El nombre no puede ser vacío")
    @Size(max=150, message="El nombre del ejercicio no puede ser de más de 150 caracteres")
    @Column(length = 150, nullable = false)
    private String name;

    @NotNull(message="Debe contener un tipo de ejercicio")
    @NotBlank(message="Debe contener un tipo de ejercicio")
    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private TypeExercices type;

    public long getIdExercices() {
        return idExercices;
    }

    public void setIdExercices(Long idExercices) {
        this.idExercices = idExercices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeExercices getType() {
        return type;
    }

    public void setType(TypeExercices type) {
        this.type = type;
    }
}
