package reservacarros;

import java.util.ArrayList;

/**
 * Created by Andre on 17/12/2016.
 */
public class Locadora {

    String nome;
    //taxa => valor por dia
    private double taxaSemana;
    private double taxaFinalSemana;
    private double taxaSemanaFidelidade;
    private double taxaFinalSemanaFidelidade;

    ArrayList<Carro> carrosDisponives;

    Locadora(String nome, double taxaSemana, double taxaFinalSemana, 
            double taxaSemanaFidelidade, double taxaFinalSemanaFidelidade,ArrayList<Carro> carros){
        this.nome = nome;
        this.taxaSemana = taxaSemana;
        this.taxaFinalSemana = taxaFinalSemana;
        this.taxaSemanaFidelidade = taxaSemanaFidelidade;
        this.taxaFinalSemanaFidelidade = taxaFinalSemanaFidelidade;
        this.carrosDisponives = carros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxaSemana() {
        return taxaSemana;
    }

    public void setTaxaSemana(double taxaSemana) {
        this.taxaSemana = taxaSemana;
    }

    public double getTaxaFinalSemana() {
        return taxaFinalSemana;
    }

    public void setTaxaFinalSemana(double taxaFinalSemana) {
        this.taxaFinalSemana = taxaFinalSemana;
    }

    public double getTaxaSemanaFidelidade() {
        return taxaSemanaFidelidade;
    }

    public void setTaxaSemanaFidelidade(double taxaSemanaFidelidade) {
        this.taxaSemanaFidelidade = taxaSemanaFidelidade;
    }

    public double getTaxaFinalSemanaFidelidade() {
        return taxaFinalSemanaFidelidade;
    }

    public void setTaxaFinalSemanaFidelidade(double taxaFinalSemanaFidelidade) {
        this.taxaFinalSemanaFidelidade = taxaFinalSemanaFidelidade;
    }

    public ArrayList<Carro> getCarrosDisponives() {
        return carrosDisponives;
    }

    public void setCarrosDisponives(ArrayList<Carro> carrosDisponives) {
        this.carrosDisponives = carrosDisponives;
    }
   
    
}
