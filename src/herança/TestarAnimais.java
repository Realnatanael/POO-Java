package herança;

public class TestarAnimais {
    public static void main(String[] args) {
        // Criação do objeto camelo do tipo Mamifero
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, "macho" ,"Plantas");
        // Exibindo os dados do camelo
        camelo.dadosMamifero();

        // Criação do objeto tubarao do tipo Peixe
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f,"macho",  "Barbatanas e cauda");
        // Exibindo os dados do tubarao
        tubarao.dadosPeixe();

        // Criação do objeto ursocanada do tipo Mamifero
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "macho", "Mel");
        // Exibindo os dados do ursocanada
        ursocanada.dadosMamifero();

        // Criação do objeto arara do tipo Ave
        Ave arara = new Ave("Arara", 0.5f, 2, "Azul", "Terra", 0.5f, "fêmea", "Colorida");
        // Exibindo os dados da arara
        arara.dadosAve();

        // Criação do objeto cobra do tipo Reptil
        Reptil cobra = new Reptil("Cobra", 2.0f, 0, "Verde", "Terra", 1.0f, "fêmea", "Escamas");
        // Exibindo os dados da cobra
        cobra.dadosReptil();
    }
}
