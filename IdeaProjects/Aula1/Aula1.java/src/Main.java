import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = leitorDeDados.nextInt();

        System.out.println("Digite o seu salário:");
        double salario = leitorDeDados.nextDouble();

        System.out.println("Digite o seu sexo:");
        char sexo = leitorDeDados.next().charAt(0);

        System.out.println("Você é casado?");
        boolean casado = leitorDeDados.nextBoolean();

        System.out.println("Qual seu nome?");
        String nome = leitorDeDados.next();

        leitorDeDados.close();

        int umaVariavel = 45 * 3;
        int outraVariavel = 65;
        int maisOutraVariavel = umaVariavel + outraVariavel;

        double porcentagemDeAumento = 10;
        double salarioReajustados = salario + (salario / 100 * porcentagemDeAumento);

        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(casado);
        System.out.println(nome);

        System.out.println(salarioReajustados);
        System.out.println("As informações da pessoa são:\n " +
                "Nome " + nome
                + ", Idade: " + idade
                + ", Salario; " + salario
                + ", Sexo: " + sexo
                + ", Casado: "  + casado);

    }
}