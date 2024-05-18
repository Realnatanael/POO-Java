package herança;

public class Ave extends Animal {
    //Atributo específico da classe Ave
    private String corPena;

    //Construtor que inicializa os atributos da classe Ave e Animal
    public Ave(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String sexo, String corPena) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia, sexo);
        this.corPena = corPena;
    }

    //Métodos get e set para o atributo corPena
    public String getCorPena(){
        return corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    //Método que imprime os dados da ave, incluindo os dados do animal
    public void dadosAve(){
        //Chama o método dados() da classe Animal para imprimir os dados comuns
        dados();
        //Imprime a cor da pena específica da ave
        System.out.println("Cor da pena: " + corPena);
    }
}
