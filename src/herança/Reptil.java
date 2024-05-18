package herança;

public class Reptil extends Animal {
    // Atributo específico da classe Reptil
    private String tipoDeEscama;

    // Construtor que inicializa os atributos da classe Reptil e Animal
    public Reptil(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String sexo, String tipoDeEscama) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia, sexo);
        this.tipoDeEscama = tipoDeEscama;
    }

    // Métodos get e set para o atributo tipoDeEscama
    public String getTipoDeEscama() {
        return tipoDeEscama;
    }

    public void setTipoDeEscama(String tipoDeEscama) {
        this.tipoDeEscama = tipoDeEscama;
    }

    // Método que imprime os dados do réptil, incluindo os dados do animal
    public void dadosReptil() {
        // Chama o método dados() da classe Animal para imprimir os dados comuns
        dados();
        // Imprime o tipo de escama específico do réptil
        System.out.println("Tipo de escama: " + tipoDeEscama);
    }
}
