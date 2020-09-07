package dto;

import enums.Destinos;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ViagemInternacional extends Viagem{
    private String passaporte;

    public ViagemInternacional(Destinos lugarDeDestino){
        super(lugarDeDestino);
    }

    public String getPassaporte(){
        return this.passaporte;
    }

    public void setPassaporte(String passaporte){
        this.passaporte = passaporte;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {

        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("src\\main\\resources\\application.properties"));
        int limiteDeAcompanhantes = Integer.parseInt(propriedades.getProperty("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Impossível realizar viagem internacional com mais que "+ limiteDeAcompanhantes +" acompanhante");
        }
    }
}
