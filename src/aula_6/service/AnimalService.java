package aula_6.service;

import aula_6.model.Cachorro;
import aula_6.model.Gato;

import java.util.List;

public class AnimalService {


    public List<Cachorro> cadastrarCachorro(List<Cachorro> cachorros, Cachorro cachorro) {
        cachorros.add(cachorro);
        return cachorros;
    }

    public List<Cachorro> deletarCachorros(List<Cachorro> cachorros, int indice) {
        cachorros.remove(indice);
        cachorros.forEach(cachorro -> {
            System.out.println(cachorro.getRaca());
        });
        return cachorros;
    }

    public void buscarCachorro(List<Cachorro> cachorros, String raca) {
        cachorros.forEach(cachorro -> {
            if (cachorro.getRaca().equals(raca)) {
                System.out.printf("o cachorro da raca %s late em fucking %.2f decebéis", cachorro.getRaca(), cachorro.getAlturaLatido());
                System.out.printf(" ,além disso ele pesa %d kg e mede %.2f cm", cachorro.getPeso(), cachorro.getAltura());
                System.out.println();
            }
        });
    }
    // criar um método atualiza cachorro -> 3 parâmetros: Lista de dog, indice e um dog, retornar a lista de
    // cachorro com o cachorro do indice que vc passou atualizado com o cachorro que passou.

    public List<Cachorro> atualizarCachorro(List<Cachorro> cachorros, String raca, Cachorro cachorroNovo) {
        cachorros.forEach(cachorro -> {
            if (cachorro.getRaca().equals(raca)) {
                cachorro.setRaca(cachorroNovo.getRaca());
                cachorro.setAlturaLatido(cachorroNovo.getAlturaLatido());
                cachorro.setAltura(cachorroNovo.getAltura());
                cachorro.setPeso(cachorroNovo.getPeso());
                System.out.println(cachorroNovo.getRaca());
            }
        });
        return cachorros;
    }

    public List<Gato> cadastrarGato(List<Gato> gatos, Gato gato) {
        gatos.add(gato);
        return gatos;
    }

    public List<Gato> deletarGato(List<Gato> gatos, int tamanhoDaCalda) {
        gatos.removeIf(gato ->
                gato.getTamanhoDaCalda() == tamanhoDaCalda);
        gatos.forEach(gato -> {
            System.out.printf("o gato que mede %.2f cm, não foi removido", gato.getAltura());
            System.out.println();
        });
        return gatos;
    }

    // criando um método público, retorna vazio (void), recebendo como parametro
    // uma lista de gatos
    public void buscarGato(List<Gato> gatos, int peso) {
        gatos.forEach(gato -> {
            if (gato.getPeso() != peso) {
                System.out.printf("O gato que tem %.2f de altura não foi pego pelo peso", gato.getAltura());
                System.out.println();
            }
        });
    }

    public List<Gato> atualizarGato(List<Gato> gatos, double alturaMiado, Gato gatoNovo) {
        gatos.forEach(gato -> {
            if (gato.getAlturaMiado() == alturaMiado) {
                gato.setAltura(gatoNovo.getAltura());
                gato.setAlturaMiado(gatoNovo.getAlturaMiado());
                gato.setPeso(gatoNovo.getPeso());
                gato.setTamanhoDaCalda(gatoNovo.getTamanhoDaCalda());
                System.out.printf("A calda dele tem %d cm, a altura do miado é de %.3f decibéis," +
                                "ele pesa %d kg e possui %.1f metros",
                        gatoNovo.getTamanhoDaCalda(), gatoNovo.getAlturaMiado(),
                        gatoNovo.getPeso(), gatoNovo.getAltura());
            }
        });
        return gatos;
    }
}
