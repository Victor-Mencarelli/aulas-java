public class Exercicio2Aula2 {
    public static void main(String[] args) {
        double nota1 = 3.5;
        double nota2 = 4.5;
        double mediaDasNotas = (nota1 + nota2) /2;
        System.out.println("A média das somas é de:" + mediaDasNotas);

        double valorDouble = 9.7;
        int valorInt = (int) valorDouble;

        System.out.println("Valor de double" + valorDouble);
        System.out.println("Valor de int" + valorInt);

        char sexo = 'F';
        String nome = "Sophia";
        System.out.println(nome + " É do sexo " + sexo);

        double precoProduto = 19.99;
        int quantidade = 7;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O preço do produto é de: " + valorTotal);

        double valorEmDorlares = 25;
        double realValor = 4.94;
        double total = realValor * valorEmDorlares;
        System.out.println("O valor total é de: " + total);

        double precoOriginal = 72.30;
        double percentualDesconto = 20 ;

        double descontoProduto = ( precoOriginal * percentualDesconto) /100;

        double resultadoProduto = (precoOriginal - descontoProduto);
        System.out.println("O preço com desconto do produto é de: R$" + resultadoProduto);
    }
}
