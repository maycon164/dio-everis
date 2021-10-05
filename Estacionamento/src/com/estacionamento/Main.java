package com.estacionamento;

import com.estacionamento.classes.TipoCarro;
import com.estacionamento.classes.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Olá, mundo");
        //System.out.println("Adeus, Mundo");
        Veiculo c1 = new Veiculo("ASDF", "Ronaldo", "Unico", "Sem fator", "12:30",
                "15:45", 12.90, TipoCarro.CARRO);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(c1);

        System.out.println(veiculos);
        c1.acelerar();
    }
}