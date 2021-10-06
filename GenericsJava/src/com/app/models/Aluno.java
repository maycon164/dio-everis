package com.app.models;

import com.app.interfaces.Estudar;

public class Aluno extends Pessoa implements Estudar {

    private String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    };

    public String getCurso() {
        return curso;
    }

    @Override
    public String estudar() {
       return "Preciso estudar as materias do curso de " + this.curso;
    }
}
