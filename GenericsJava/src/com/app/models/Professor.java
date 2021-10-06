package com.app.models;

import com.app.interfaces.MinistrarAula;

public class Professor extends Pessoa implements MinistrarAula {
    private String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void ministrarAula() {
        System.out.println("Preciso dar aula de " + materia);
    }
}
