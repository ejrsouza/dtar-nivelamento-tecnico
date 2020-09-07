package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
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
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro:");
            System.out.println(excecao.getMessage());
        }


        System.out.println("Destino da viagem: " + viagem.getDestino().getCidade());
        System.out.println("Quantidade de Acompanhantes: " + viagem.getAcompanhantes().size());
        System.out.println("Lista de acompanhantes:");
        for (Acompanhante acompanhante : viagem.getAcompanhantes()){
            System.out.println("Nome: " + acompanhante.getNome());
            System.out.println("Cadastro confirmado: " + acompanhante.isConfirmouCadastro());
        }

        ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.MANAUS);
        try {
            viagemNacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao){
        System.out.println("Ocorreu um erro:");
        System.out.println(excecao.getMessage());
    }
        viagemNacional1.setCpf("12345678915");

        ViagemInternacional viagemInternacional1 = new ViagemInternacional(Destinos.ACAPULCO);
        try {
        viagemInternacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro:");
            System.out.println(excecao.getMessage());
        }
        viagemInternacional1.setPassaporte("15965-56");

        System.out.println(viagemNacional1.getDestino().getCidade());
        System.out.println(viagemInternacional1.getDestino().getCidade());
        System.out.println(viagemNacional1.getCpf());
        System.out.println(viagemInternacional1.getPassaporte());

        System.out.println(viagemInternacional1.calculadorPrevisaoDeDiasParaRetorno());
        System.out.println(viagemNacional1.calculadorPrevisaoDeDiasParaRetorno());
    }
}
