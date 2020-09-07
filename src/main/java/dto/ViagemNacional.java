package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;
import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino){
        super(lugarDeDestino);
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {


        //Apesar de parecer que é inteiro, o dado no arquivo é uma String, por isso requer conversão
        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Impossível realizar viagem nacional com mais que " + limiteDeAcompanhantes +" acompanhantes");
        }
    }

    public int calculadorPrevisaoDeDiasParaRetorno(){
        int quantidadeDeDias = 0;
        switch (this.getDestino()){
            case MANAUS: quantidadeDeDias = 5; break;
            case RECIFE: quantidadeDeDias = 4; break;
            case MARINGA: quantidadeDeDias = 3; break;
            case OSASCO: quantidadeDeDias = 1; break;
            case GOIAS: quantidadeDeDias = 0; break;
        }
        return quantidadeDeDias;
    }
}
