package aula_2;

public class Aula2 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        soma(numero1, numero2);
        divide(numero1, numero2);
        subtrai((double) numero1, (double) numero2);
        multiplica(numero1, numero2);
        verificaIgualdade(numero1, numero2);
        verificarIgualdadeBoolean(numero1, numero2);
        verificarMaiorQueMenorQue(numero1, numero2);
    }

    public static void soma(int numero1, int numero2) {
        double resultado = numero1 + numero2;
        System.out.println(resultado);
    }

    public static void divide(int numero1, int numero2) {
        double resultado = (double) numero1 / (double) numero2;
        System.out.println(resultado);
    }

    public static void subtrai(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println(resultado);
    }

    public static void multiplica(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        System.out.println(resultado);
    }

    public static void verificaIgualdade(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.println("É igual porra");
        } else {
            System.out.println("É diferente seu merda");
        }
    }

    public static void verificarIgualdadeBoolean(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        boolean verificar = resultado == 2;
        if (!verificar == true) {
            System.out.println("o resultado do verificar passou");
        } else {
            System.out.println("o resultado do verificar não passou");
        }
    }

    public static void verificarMaiorQueMenorQue(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        if (resultado > 5) {
            System.out.println("resultado maior que 5");
        } else if (resultado < 5) {
            System.out.println("resultado menor que 5");
        } else if (resultado == 5) {
            System.out.println("resultado igual a 5");
        } else {
            System.out.println("deu merda");
        }
    }
}
