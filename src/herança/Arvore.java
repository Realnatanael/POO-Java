package herança;

public class Arvore extends Planta{
    // Atributos da classe Arvore
    private String tipoFolha;
    private String tipoFruto;
    private String tipoRaiz;
    private String tipoSemente;

    // Construtor que inicializa os atributos
    public Arvore(String nome, String especie, String familia, String ordem, String classe, String divisao, String reino, String tipoFolha, String tipoFruto, String tipoRaiz, String tipoSemente){
        super(nome, especie, familia, ordem, classe, divisao, reino);
        this.tipoFolha = tipoFolha;
        this.tipoFruto = tipoFruto;
        this.tipoRaiz = tipoRaiz;
        this.tipoSemente = tipoSemente;
    }

    // Métodos get e set para cada atributo
    public String getTipoFolha() {
        return tipoFolha;
    }

    public void setTipoFolha(String tipoFolha) {
        this.tipoFolha = tipoFolha;
    }

    public String getTipoFruto() {
        return tipoFruto;
    }

    public void setTipoFruto(String tipoFruto) {
        this.tipoFruto = tipoFruto;
    }

    public String getTipoRaiz() {
        return tipoRaiz;
    }

    public void setTipoRaiz(String tipoRaiz) {
        this.tipoRaiz = tipoRaiz;
    }

    public String getTipoSemente() {
        return tipoSemente;
    }

    public void setTipoSemente(String tipoSemente) {
        this.tipoSemente = tipoSemente;
    }

    // Método que imprime os dados da árvore, incluindo os dados da planta
    public void dadosArvore() {
        // Chama o método dados() da classe Planta para imprimir os dados comuns
        dadosPlanta();
        // Imprime os tipos específicos da árvore
        System.out.println("Tipo de folha: " + tipoFolha);
        System.out.println("Tipo de fruto: " + tipoFruto);
        System.out.println("Tipo de raiz: " + tipoRaiz);
        System.out.println("Tipo de semente: " + tipoSemente);
    }
}
