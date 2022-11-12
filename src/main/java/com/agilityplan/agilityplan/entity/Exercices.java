package com.agilityplan.agilityplan.entity;

import javax.persistence.*;

@Entity
@Table(name="exercices")
public class Exercices {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idExercices;

    @Column(length = 150, nullable = false)
    private String name;

    @ManyToOne
    @Column(nullable = false, length = 20)
    @Enumerated(value = EnumType.STRING) //TODO probar con ordinal, quiero que guarde el id
    private TypeExercices type;

    public Long getIdExercices() {
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
