public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de Lançamento" + anoDeLançamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        ///  media calculada pelas 3 notas
        double media = (9.8 + 6.2 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("Esta é a sinopse:" + sinopse);

        int classificaçao;
        classificaçao = (int) (media /2);
        System.out.println(classificaçao);


    }
}