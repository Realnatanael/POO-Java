package herança;

public class TestarPlantas {
    public static void main(String[] args){
        // Criação do objeto samambaia do tipo Planta
        Planta samambaia = new Planta("Samambaia", "Samambaia", "Pteridophyta", "Polypodiales", "Polypodiopsida", "Pteridophyta", "Plantae");
        // Exibindo os dados da samambaia
        samambaia.dadosPlanta();

        // Criação do objeto pinheiro do tipo Arvore
        Arvore pinheiro = new Arvore("Pinheiro", "Pinus", "Pinaceae", "Pinales", "Pinopsida", "Pinophyta", "Plantae", "Aciculada", "Conífero", "Profunda", "Nua");
        // Exibindo os dados do pinheiro
        pinheiro.dadosArvore();
    }
}
