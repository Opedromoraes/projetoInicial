package aula_6.model;

public class Gato extends Animal {
    private int tamanhoDaCalda;
    private double alturaMiado;
    private boolean viraLata;


    public Gato(int tamanhoDaCalda, double alturaMiado, boolean viraLata, int peso, double altura) {
        super(peso, altura);
        this.tamanhoDaCalda = tamanhoDaCalda;
        this.alturaMiado = alturaMiado;
        this.viraLata = viraLata;
    }
    public Gato(){
        super();
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

    public boolean isViraLata() {
        return viraLata;
    }

    public void setViraLata(boolean viraLata) {
        this.viraLata = viraLata;
    }
}
