package herança;

public class Mamifero extends Animal {
    // Atributo específico da classe Mamifero
    private String alimento;

    // Construtor que inicializa os atributos da classe Mamifero e Animal
    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    // Métodos get e set para o atributo alimento
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método que imprime os dados do mamífero, incluindo os dados do animal
    public void dadosMamifero() {
        // Chama o método dados() da classe Animal para imprimir os dados comuns
        dados();
        // Imprime o alimento específico do mamífero
        System.out.println("Alimento: " + alimento);
    }
}
