package com.estacionamento.classes;

import com.estacionamento.interfaces.Correr;

public class Veiculo implements Correr {
    private String placa;
    private String marca;
    private String modelo;
    private String fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private double totalEstacionamento;
    private TipoCarro tipoCarro;

    public Veiculo(String placa, String marca, String modelo, String fatorEstacionamento, String horaEntrada, String horaSaida, double totalEstacionamento, TipoCarro tipoCarro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fatorEstacionamento = fatorEstacionamento;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.totalEstacionamento = totalEstacionamento;
        this.tipoCarro = tipoCarro;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(String fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }

    public void setTotalEstacionamento(double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }

    public String toString(){
        return "Tipo: " + this.tipoCarro
                +"\nPlaca: " + this.placa
                +"\nModelo: " + this.modelo
                +"\nHoraEntrada: " + this.horaEntrada
                +"\nHoraSaída: " + this.horaSaida;
    }

    @Override
    public void acelerar() {

        System.out.println("Acelerando......");
        System.out.println("VRUM........");
    }

    @Override
    public void frear() {
        System.out.println("Freando......");
        System.out.println("BLEEH........");
    }
}
