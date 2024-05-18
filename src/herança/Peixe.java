package herança;

public class Peixe extends Animal {
    // Atributo específico da classe Peixe
    private String caracteristica;

    // Construtor que inicializa os atributos da classe Peixe e Animal
    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String sexo, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia, sexo);
        this.caracteristica = caracteristica;
    }

    // Métodos get e set para o atributo caracteristica
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Método que imprime os dados do peixe, incluindo os dados do animal
    public void dadosPeixe() {
        // Chama o método dados() da classe Animal para imprimir os dados comuns
        dados();
        // Imprime a característica específica do peixe
        System.out.println("Característica: " + caracteristica);
    }
}
