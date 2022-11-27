package com.agilityplan.agilityplan.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class TypeExercices {
    /* Aunque los tipos de ejercicios la idea es que sean fijos, podría usarse con un enum
     * y meter ahí los tipos que toquen.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTypeExercices;

    @Column(length = 20)
    private String name;

    public long getIdTypeExercices() {
        return idTypeExercices;
    }

    public void setIdTypeExercices(long idTypeExercices) {
        this.idTypeExercices = idTypeExercices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*BASICS,
    RUNNING_CONTACT,
    SLALOM,
    CONDUCTION,
    COURSE,
    FITNESS;*/

    /*BASICS              ("Basics", 1),
    RUNNING_CONTACT     ("RunningContact", 2),
    SLALOM              ("Slalom", 3),
    CONDUCTION          ("Conduction", 4),
    COURSE              ("Course", 5);

    private String name;
    private long id;

    TypeExercices(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }*/
}
