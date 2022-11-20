package com.agilityplan.agilityplan.entity;

import javax.persistence.OneToMany;

public enum TypeExercices {
    /* Aunque los tipos de ejercicios la idea es que sean fijos, podría usarse en vez de enum como una tabla normal
     * (con el repository, service y controller pertinentes)
     * y meter ahí los tipos que toquen.
     */

    BASICS              ("Basics", 1),
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
    }
}
