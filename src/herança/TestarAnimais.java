package herança;

public class TestarAnimais {
    public static void main(String[] args) {
        // Criação do objeto camelo do tipo Mamifero
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, "Plantas");
        // Exibindo os dados do camelo
        camelo.dadosMamifero();

        // Criação do objeto tubarao do tipo Peixe
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        // Exibindo os dados do tubarao
        tubarao.dadosPeixe();

        // Criação do objeto ursocanada do tipo Mamifero
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");
        // Exibindo os dados do ursocanada
        ursocanada.dadosMamifero();
    }
}
