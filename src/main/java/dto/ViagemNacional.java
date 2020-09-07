package dto;

import enums.Destinos;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ViagemNacional extends Viagem{
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

        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("src\\main\\resources\\application.properties"));
        //Apesar de parecer que é inteiro, o dado no arquivo é uma String, por isso requer conversão
        int limiteDeAcompanhantes = Integer.parseInt(propriedades.getProperty("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Impossível realizar viagem nacional com mais que " + limiteDeAcompanhantes +" acompanhantes");
        }
    }
}
