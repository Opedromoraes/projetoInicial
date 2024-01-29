package aula_2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> senhas = new ArrayList<>();
        senhas.add("2200");
        senhas.add("1020");
        senhas.add("2022");
        senhas.add("2002");

        verificarSenha(senhas);
    }

    public static void verificarSenha(List<String> senhas) {
        senhas.forEach(senha -> {
                    if (senha.equals("2002")) {
                        System.out.println("Acesso permitido");
                    } else {
                        System.out.println("Senha inválida");
                    }
                }
        );
    }
}
