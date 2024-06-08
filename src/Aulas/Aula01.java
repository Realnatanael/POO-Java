package Aulas;

public class Aula01 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a Aula 01!");
        System.out.println("Tipos de dados em Java: Primitivos e Referência");
        System.out.println("Tipos de dados primitivos: int, double, float, char, boolean, byte, short, long");
        System.out.println("Tipos de dados de referência: String, Array, Classe, Interface");
        System.out.println("Exemplo de tipos de dados primitivos:");
        int idade = 30;
        double altura = 1.75;
        float peso = 70.5f;
        char sexo = 'M';
        boolean casado = false;
        byte filhos = 2;
        short salario = 1500;
        long populacao = 1000000;
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Casado: " + casado);
        System.out.println("Filhos: " + filhos);
        System.out.println("Salário: " + salario);
        System.out.println("População: " + populacao);
        System.out.println("Exemplo de tipos de dados de referência:");
        String nome = "João";
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Nome: " + nome);
        System.out.println("Números: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4]);
        System.out.println("Strings são arrays de caracteres.");
        System.out.println("Exemplo de tipos de dados de referência:");
        System.out.println("Classe: Pessoa");
        System.out.println("Interface: Runnable");
        System.out.println("Você verá mais sobre classes e interfaces nas próximas aulas.");
    }
}