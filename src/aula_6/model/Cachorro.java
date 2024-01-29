package aula_6.model;

public class Cachorro extends Animal {
    private String raca;
    private double alturaLatido;

    public Cachorro(int peso, double altura) {
        super(peso, altura);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAlturaLatido() {
        return alturaLatido;
    }

    public void setAlturaLatido(double alturaLatido) {
        this.alturaLatido = alturaLatido;
    }
}
