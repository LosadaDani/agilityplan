package com.agilityplan.agilityplan.entity;

public enum TypeExercices {
    //Aunque los tipos de ejercicios la idea es que sean fijos, podría usarse en vez de enum como una tabla normal
    // (con el repository, service y controller pertinentes)
    // y meter ahí los tipos que toquen.
    BASICS,
    RUNNING_CONTACT,
    SLALOM,
    SEQUENCE,
    CONDUCTION
}
