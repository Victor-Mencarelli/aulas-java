import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com numero 1:");
        int numero1 = leitor.nextInt();

        System.out.println("Entre com numero 2:");
        int numero2 = leitor.nextInt();

        System.out.println("Entre com numero 3:");
        int numero3 = leitor.nextInt();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("Media:" + media);

        int mutiplicaçao = numero1 * numero2 * numero3;
        System.out.println("Mutiplicação " + mutiplicaçao);
    }
}