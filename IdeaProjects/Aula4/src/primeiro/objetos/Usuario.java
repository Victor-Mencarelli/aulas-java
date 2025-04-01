package primeiro.objetos;

class Usuario {
    int idade;
    double salario;
    char sexo;
    boolean casado;
    String nome;

    Usuario(int idade, double salario, char sexo, boolean casado, String nome){
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.casado = casado;
        this.nome = nome;
    }

    void exibir() {
        System.out.println("As informações da pessoa são:\n " +
                "Nome: " + nome
                + ", Idade: " + idade
                + ", Salário: " + salario
                + ", Sexo: " + sexo
                + ", Casado: " + casado);

        Usuario usuario = new Usuario(idade, salario, sexo, casado, nome);
        Usuario outroUsuario = new Usuario(50, 564.45, 'M', false, "Claudia");

        usuario.exibir();
        outroUsuario.exibir();
    }
}
