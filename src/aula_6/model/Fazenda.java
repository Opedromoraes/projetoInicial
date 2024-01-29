package aula_6.model;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Animal> animais = new ArrayList<>();

    public Fazenda(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
