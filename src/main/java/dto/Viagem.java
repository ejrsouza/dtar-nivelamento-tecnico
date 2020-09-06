package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    public Viagem(Destinos lugarDeDestino){
        this.destino = lugarDeDestino;
    }

    //será utilizado por classes que instanciarem esse objeto para acessar o atributo "destino"
    public Destinos getDestino() {
        return this.destino;
    }

    //será utilizado por classes que instanciarem esse objeto para enviar o dado que preencherá o atributo "destino"
    public void setDestino(Destinos lugarDeDestino){
        this.destino = lugarDeDestino;
    }

    public List<Acompanhante> getAcompanhantes(){
        return this.acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception{
        this.acompanhantes = acompanhantes;
    }

}
