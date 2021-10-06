package com.app.generics;

import com.app.interfaces.Estudar;
import com.app.models.Aluno;
import com.app.models.Pessoa;
import com.app.models.Professor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maycon", 19, "Analise e Desenvolvimento de Software");
        Professor p1 = new Professor("Antornio", 45, "Java POO");
        mostrar(a1);
        /*List<? ex> estudantes = new ArrayList<>();
        estudantes.add(a1);*/

    }

    public static <T extends Estudar> void mostrar( T p){

        System.out.println(p.estudar());

    }
}
