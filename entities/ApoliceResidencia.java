package programacaoDeComputadoresII.projectapolice.entities;

import java.util.Date;

public class ApoliceResidencia extends Apolice {
    private String endereco;
    private int CEP;
    private String bairro;
    private String municipio;
    private String cidade;
    private String UF;

    public ApoliceResidencia(int codigoDaSeguradora, double valorDoPremio, double valorDoBem, double valorDaApolice, String data, String endereco, int CEP, String bairro, String municipio, String cidade, String UF) {
        super(codigoDaSeguradora, valorDoPremio, valorDoBem, valorDaApolice, data);
        this.endereco = endereco;
        this.CEP = CEP;
        this.bairro = bairro;
        this.municipio = municipio;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public double calcularParcelamento(int qntDeParcelas){
        return (getValorDoBem() * 0.1)/qntDeParcelas;
    }

    @Override
    public String toString() {
        return "ApoliceResidencia : {" +
                "endereco: '" + endereco +  '\'' +
                ", CEP: " + CEP +
                ", bairro: '" + bairro +  '\'' +
                ", municipio: '" + municipio +  '\'' +
                ", cidade: '" + cidade +  '\'' +
                ", UF: '" + UF +  '\'' +
                '}';
    }
}
