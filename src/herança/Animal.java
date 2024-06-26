package herança;

public class Animal {
    // Atributos da classe Animal
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;
    private String sexo; 

    // Construtor que inicializa os atributos
    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String sexo) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
        this.sexo = sexo;
    }

    // Métodos get e set para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo =sexo;
    }

    // Método que imprime os dados do animal
    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de patas: " + numeroDePatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidadeMedia + " m/s");
        System.out.println("sexo: " + sexo);
    }
}
