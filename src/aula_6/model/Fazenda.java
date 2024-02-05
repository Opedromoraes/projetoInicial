package aula_6.model;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Animal> animais = new ArrayList<>();

    private List<Gato> gatos;
    private List<Cachorro> cachorros;

    public Fazenda() {
    }

    public Fazenda(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Cachorro> getCachorros() {
        return cachorros;
    }

    public void setCachorros(List<Cachorro> cachorros) {
        this.cachorros = cachorros;
    }

    public List<Gato> getGatos() {
        return gatos;
    }

    public void setGatos(List<Gato> gatos) {
        this.gatos = gatos;
    }
}
