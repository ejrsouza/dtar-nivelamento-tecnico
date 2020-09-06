package app;

import dto.Acompanhante;
import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String [] args){
        Viagem viagem = new Viagem(Destinos.GOIAS);

        viagem.setDestino(Destinos.MARINGA);

        viagem.setDestino(Destinos.MANAUS);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Poliane");
        acompanhante1.setConfirmouCadastro(false);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Edleuza");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        viagem.setAcompanhantes(acompanhantes);

        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0).getNome());
        System.out.println(viagem.getAcompanhantes().get(1).getNome());
    }
}
