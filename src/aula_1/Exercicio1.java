package aula_1;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome = "Diego";
        int price = 2100;
        String nome1 = "Office desk";
        double price1 = 650.5;
        int years = 30;
        char gender = 'F';
        int code = 5290;
        double eight = 53.234567;

        print(nome, price, nome1, price1, years, gender, code, eight);
        print("carros",price, nome1, price1, years, gender, code, eight);
    }

    public static void print(String nome, int price, String nome1, double price1, int years, char gender, int code, double eight) {
        System.out.printf("%s witch price is %d %n", nome, price);
        System.out.printf("%s witch price is %.1f %n", nome1, price1);
        System.out.printf("Record: %d years old, code %d and gender %c %n", years, code, gender);
        System.out.printf("Measue with eight decimal places: %.6f %n", eight);
        System.out.printf("Rouded: %.3f %n", eight);
        System.out.printf("US decimal point: %.3f %n", eight);
    }
}
