package enums;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringá"),
    GOIAS("Goiás"),
    RECIFE("Recife"),
    MANAUS("Manaus"),
    MIAMI("Miami"),
    ACAPULCO("Acapulco");

    private String cidade;

    //Não há modificadores em "enum", por isso não há: public, private... antes do nome do construtor
    Destinos(String cidadeDestino){
        this.cidade = cidadeDestino;
    }

    public String getCidade(){
        return this.cidade;
    }

}
