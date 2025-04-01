import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Informe a idade do usuario: ");
        int idade = leitorDeDados.nextInt();

        System.out.println("Informe seu salário: ");
        double salario = leitorDeDados.nextDouble();

        System.out.println("Informe seu sexo:");
        char sexo = leitorDeDados.next().charAt(0);

        System.out.println("O usuario é casado?");
        boolean casado = leitorDeDados.nextBoolean();

        System.out.println("Informe seu nome: ");
        String nome = leitorDeDados.next();

        int umaVariavel = 45 * 3;
        int outraVariavel = 65;
        int maisOutraVariavel = umaVariavel + outraVariavel;

        double porcentagemDeAumento = 10;
        double salarioReajusado = salario + (salario / 100 * porcentagemDeAumento);

        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(casado);
        System.out.println(nome);

        System.out.println(salarioReajusado);
        System.out.println("As infos da pessoa são: " + "Nome: " + nome
                + "idade: " + idade
                + "salario: " + salario
                + "sexo: " + sexo
                + "casado: " + casado);
    }
}