package aula_6.model;

public class Animal {
    private int peso;
    private double altura;

    public Animal(int peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Animal() {

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
