package app;

import dto.Acompanhante;
import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String [] args){
        Viagem viagem = new Viagem(Destinos.GOIAS);

        viagem.setDestino(Destinos.RECIFE);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Poliane");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Edleuza");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        viagem.setAcompanhantes(acompanhantes);

        System.out.println("Destino da viagem: " + viagem.getDestino().getCidade());
        System.out.println("Quantidade de Acompanhantes: " + viagem.getAcompanhantes().size());
        System.out.println("Lista de acompanhantes:");
        for (Acompanhante acompanhante : viagem.getAcompanhantes()){
            System.out.println("Nome: " + acompanhante.getNome());
            System.out.println("Cadastro confirmado: " + acompanhante.isConfirmouCadastro());
        }
    }
}
