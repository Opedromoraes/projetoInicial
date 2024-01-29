package aula_6.service;

import aula_6.model.Cachorro;

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

    public List<Cachorro> atualizarCachorro(List<Cachorro> cachorros,String raca,Cachorro cachorroNovo){
        cachorros.forEach(cachorro->{
            if (cachorro.getRaca().equals(raca)){
                cachorro.setRaca(cachorroNovo.getRaca());
                cachorro.setAlturaLatido(cachorroNovo.getAlturaLatido());
                cachorro.setAltura(cachorroNovo.getAltura());
                cachorro.setPeso(cachorroNovo.getPeso());
                System.out.println(cachorroNovo.getRaca());
            }
        });
        return cachorros;
    }
}
