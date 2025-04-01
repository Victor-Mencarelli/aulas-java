import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando um scanner para ler dados
        Scanner scanner = new Scanner(System.in);

        //solicitar e ler um numero
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        //calcular numero anterio e posterios
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        //exibir resultado
        System.out.println("O numero digitado foi: " + numero);
        System.out.println("O numero antecessor foi: " + antecessor);
        System.out.println("O numero sucessor foi: " + sucessor);

        scanner.close();
    }
}