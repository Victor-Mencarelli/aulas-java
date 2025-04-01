import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando um scaner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        //Perguntar nome do funcionario
        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();

        //perguntar o salario atual do funcionar
        System.out.println("Qual seu salario atual? ");
        Double salarioAtual = scanner.nextDouble();

        //Agora o aumento salarial do funcionario
        double aumento = salarioAtual * 1.10;

        //exibir nome e o aumento do salario
        System.out.println("Funcionario: " + nome);
        System.out.println("Novo salario: " + aumento);

        scanner.close();

    }
}