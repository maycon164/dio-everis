package com.app.generics;

import com.app.interfaces.Estudar;
import com.app.models.Aluno;
import com.app.models.Pessoa;
import com.app.models.Professor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maycon", 19, "Analise e Desenvolvimento de Software");

        Professor p1 = new Professor("Antornio", 45, "Java POO");
        Professor p2 = new Professor("Marcelo", 75, "Java WEB");
        Professor p3 = new Professor("Jose", 35, "Java Security");

        List<Pessoa> listaPessoas = Arrays.asList(a1);
        List<Professor> listaProfessores = Arrays.asList(p1, p2, p3);

        copiarListas(listaPessoas, listaProfessores);

    }

    public static void copiarListas(List<? super Pessoa> pessoas, List<? extends Pessoa> outra){
        System.out.println("Adicionando os itens da segunda lista na primeira");
        outra.forEach(pessoas::add);
        System.out.println(".....");
        pessoas.forEach(System.out::println);
    }

    public static <T extends Estudar> void mostrar( T p){
        System.out.println(p.estudar());

    }
}
