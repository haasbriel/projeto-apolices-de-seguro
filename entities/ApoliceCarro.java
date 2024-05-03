package programacaoDeComputadoresII.projectapolice.entities;

public class ApoliceCarro  extends Apolice {


    private String marca;
    private String modelo;
    private String placa;
    private String renavam;
    private int anoDeFabricacao;
    private long quilometragem;
    private long numeroDaVistoria;
    private String dataDaVistoria;

    public ApoliceCarro(int codigoDaSeguradora, double valorDoPremio, double valorDoBem, double valorDaApolice,String data, String marca, String modelo, String placa, String renavam, int anoDeFabricacao, long quilometragem) {
        super(codigoDaSeguradora, valorDoPremio, valorDoBem, valorDaApolice, data);
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.renavam = renavam;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
        this.numeroDaVistoria = numeroDaVistoria;
        this.dataDaVistoria = dataDaVistoria;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public long getNumeroDaVistoria() {
        return numeroDaVistoria;
    }

    public void setNumeroDaVistoria(long numeroDaVistoria) {
        this.numeroDaVistoria = numeroDaVistoria;
    }

    public String getDataDaVistoria() {
        return dataDaVistoria;
    }

    public void setDataDaVistoria(String dataDaVistoria) {
        this.dataDaVistoria = dataDaVistoria;
    }

    public double calcularParcelamento(int qntDeParcelas){
        return (this.getValorDoBem() * 0.5)/qntDeParcelas;
    }

    @Override
    public String toString() {
        return "ApoliceCarro {" +
                "marca='" + marca +  '\'' +
                ", modelo='" + modelo +  '\'' +
                ", placa='" + placa +  '\'' +
                ", renavam='" + renavam +  '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", quilometragem=" + quilometragem +
                ", numeroDaVistoria=" + numeroDaVistoria +
                ", dataDaVistoria='" + dataDaVistoria +  '\'' +
                '}';
    }
}
