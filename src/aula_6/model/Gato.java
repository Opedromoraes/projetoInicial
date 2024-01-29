package aula_6.model;

public class Gato extends Animal{
    private int tamanhoDaCalda;
    private double alturaMiado;

    public Gato(int tamanhoDaCalda, double alturaMiado,int peso,double altura) {
        super(peso, altura);
        this.tamanhoDaCalda = tamanhoDaCalda;
        this.alturaMiado = alturaMiado;
    }

    public int getTamanhoDaCalda() {
        return tamanhoDaCalda;
    }

    public void setTamanhoDaCalda(int tamanhoDaCalda) {
        this.tamanhoDaCalda = tamanhoDaCalda;
    }

    public double getAlturaMiado() {
        return alturaMiado;
    }

    public void setAlturaMiado(double alturaMiado) {
        this.alturaMiado = alturaMiado;
    }
}
