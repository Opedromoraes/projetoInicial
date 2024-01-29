package aula_2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Aula2EstruturaRepeticao {
    public static void main(String[] args) {
        int numero = 5;
        List<String> nomesAlfaBeijo = new ArrayList<>();
        nomesAlfaBeijo.add("J");
        nomesAlfaBeijo.add("F");
        nomesAlfaBeijo.add("L");
        nomesAlfaBeijo.add("M");
        nomesAlfaBeijo.add("G");

        estruturaRepeticaoFor(numero);
        verificaAlfaBeijo(nomesAlfaBeijo);
    }

    public static void estruturaRepeticaoFor(int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }

    public static void verificaAlfaBeijo(List<String> nomesAlfaBeijo) {
        nomesAlfaBeijo.forEach(nome -> {
            if (nome.equals("Felix")) {
                System.out.println("Gay");
            }

        });
    }
}
