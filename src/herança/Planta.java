package herança;

public class Planta {
    // Atributos da classe Planta
    private String nome;
    private String especie;
    private String familia;
    private String ordem;
    private String classe;
    private String divisao;
    private String reino;

    // Construtor que inicializa os atributos
    public Planta(String nome, String especie, String familia, String ordem, String classe, String divisao, String reino){
        this.nome = nome;
        this.especie = especie;
        this.familia = familia;
        this.ordem = ordem;
        this.classe = classe;
        this.divisao = divisao;
        this.reino = reino;
    }

    // Métodos get e set para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia){
        this.familia = familia;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    // Método que imprime os dados da planta
    public void dadosPlanta() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Família: " + familia);
        System.out.println("Ordem: " + ordem);
        System.out.println("Classe: " + classe);
        System.out.println("Divisão: " + divisao);
        System.out.println("Reino: " + reino);
    }
}
