package programacaoDeComputadoresII.projectapolice.applications;

import programacaoDeComputadoresII.projectapolice.entities.Apolice;
import programacaoDeComputadoresII.projectapolice.entities.ApoliceCarro;
import programacaoDeComputadoresII.projectapolice.entities.ApoliceResidencia;

public class TestarApolices {

    public static void main(String[] args) {
        Apolice [] apolices= new Apolice[4];
        apolices [0] = new ApoliceCarro(4444, 700, 900, 1000, "04/04/04", "Ford", "Ka", "ASL6D94", "0000000", 2010, 100000);
        apolices [1] = new ApoliceCarro(5555, 800, 600, 2000, "05/05/05", "FIAT", "UNO", "QCU6D80", "111111", 2015, 0000000);
        apolices[2] = new ApoliceResidencia(66666, 900, 700, 3000, "06/06/06", "Rua Francisco da Silva", 84073035, "Boa Vista", "Ponta Grossa", "POnta GRossa", "PR");
        apolices[3] = new ApoliceResidencia(77777, 200, 500, 6000, "08/08/08", "Rua Pereira da Silva", 84053000, "Palmeirinha", "Carambei", "Carambei", "AL");


        for (int i = 0; i < apolices.length ; i++){
            System.out.println(apolices[i].toString());
        }
    }
}
