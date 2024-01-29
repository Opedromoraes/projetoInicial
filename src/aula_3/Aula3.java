package aula_3;

public class Aula3 {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.altura = 1.0;
        retangulo1.largura = 2.0;
        double resultado = retangulo1.calculaArea();
        System.out.println(resultado);
    }
}
