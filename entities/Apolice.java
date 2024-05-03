package programacaoDeComputadoresII.projectapolice.entities;

import java.util.Date;

public class Apolice {
    private int codigoDaSeguradora;
    private double valorDoPremio;
    private double valorDoBem;
    private double valorDaApolice;
    private String data;



    public Apolice(int codigoDaSeguradora, double valorDoPremio, double valorDoBem, double valorDaApolice, String data) {
        this.codigoDaSeguradora = codigoDaSeguradora;
        this.valorDoPremio = valorDoPremio;
        this.valorDoBem = valorDoBem;
        this.valorDaApolice = valorDaApolice;
        this.data = data;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public int getCodigoDaSeguradora() {
        return codigoDaSeguradora;
    }

    public void setCodigoDaSeguradora(int codigoDaSeguradora) {
        this.codigoDaSeguradora = codigoDaSeguradora;
    }

    public double getValorDoPremio() {
        return valorDoPremio;
    }

    public void setValorDoPremio(double valorDoPremio) {
        this.valorDoPremio = valorDoPremio;
    }

    public double getValorDoBem() {
        return valorDoBem;
    }

    public void setValorDoBem(double valorDoBem) {
        this.valorDoBem = valorDoBem;
    }

    public double getValorDaApolice() {
        return valorDaApolice;
    }

    public void setValorDaApolice(double valorDaApolice) {
        this.valorDaApolice = valorDaApolice;
    }
}
