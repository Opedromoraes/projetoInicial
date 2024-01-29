package aula_6;

import aula_6.model.Cachorro;
import aula_6.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

public class Aula6 {
    public static void main(String[] args) {
        // pacote model -> objeto animal: peso,altura,cor e nome OK
        // pacote model -> objeto cachorro: raca e alturaLatido OK
        // pacote model -> objt cachorro: construtor sem parâmetro OK / objt gato: construtor com todos parâmetros OK
        // pacote model -> objeto gato: tamanhoDaCalda e alturaMiado OK
        // pacote service -> cadastra, deleta, busca e atualiza: cachorro e gato
        // pacote model -> objt fazenda: Lista de animais
        // pacote service -> fazenda service que: cadastra, deleta,busca e atualiza.

        Cachorro cachorro = new Cachorro(3, 30.5);
        Cachorro cachorro1 = new Cachorro(1, 10.25);
        Cachorro cachorro2 = new Cachorro(30, 100.1);
        cachorro.setRaca("poodle");
        cachorro.setAlturaLatido(20.58);
        cachorro1.setRaca("pincher");
        cachorro1.setAlturaLatido(80.58);
        cachorro2.setRaca("husky siberiano");
        cachorro2.setAlturaLatido(100.58);


        List<Cachorro> cachorros = new ArrayList<>();
        AnimalService animalService = new AnimalService();
        cachorros = animalService.cadastrarCachorro(cachorros, cachorro);
        cachorros = animalService.cadastrarCachorro(cachorros, cachorro1);
        cachorros = animalService.cadastrarCachorro(cachorros, cachorro2);

        animalService.deletarCachorros(cachorros,2);
        animalService.buscarCachorro(cachorros, "pincher");
        Cachorro cachorroNovo = new Cachorro(7,50.2);
        cachorroNovo.setRaca("pastor alemão");
        cachorroNovo.setAlturaLatido(60.47);
        animalService.atualizarCachorro(cachorros,"poodle",cachorroNovo);
    }
}
