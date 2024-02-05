package aula_6;

import aula_6.model.Cachorro;
import aula_6.model.Fazenda;
import aula_6.model.Gato;
import aula_6.service.AnimalService;
import aula_6.service.FazendaService;

import java.util.ArrayList;
import java.util.List;

public class Aula6 {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro(3, 30.5);
        Cachorro cachorro1 = new Cachorro(1, 10.25);
        Cachorro cachorro2 = new Cachorro(30, 100.1);
        cachorro.setRaca("labrador");
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

        animalService.deletarCachorros(cachorros, 2);
        animalService.buscarCachorro(cachorros, "pincher");
        Cachorro cachorroNovo = new Cachorro(7, 50.2);
        cachorroNovo.setRaca("pastor alemão");
        cachorroNovo.setAlturaLatido(60.47);
        animalService.atualizarCachorro(cachorros, "poodle", cachorroNovo);

        Gato gato = new Gato(3, 10.1, false, 2, 25);
        Gato gato1 = new Gato(5, 10.8, false, 1, 10);
        Gato gato2 = new Gato(1, 10.9, false, 5, 50);

        List<Gato> gatos = new ArrayList<>();
        gatos = animalService.cadastrarGato(gatos, gato);
        gatos = animalService.cadastrarGato(gatos, gato1);
        gatos = animalService.cadastrarGato(gatos, gato2);

        animalService.deletarGato(gatos, 5);
        animalService.buscarGato(gatos, 5);

        Gato gatoNovo = new Gato(100, 90.598, false, 80, 5);
        gatos = animalService.atualizarGato(gatos, 10.9, gatoNovo);

        Gato gato3 = new Gato(6, 11.9, true, 5, 50);
        Gato gato4 = new Gato(7, 13.9, false, 10, 500);
        Gato gato5 = new Gato(8, 15.9, true, 15, 50000);
        gatos = animalService.cadastrarGato(gatos, gato3);
        gatos = animalService.cadastrarGato(gatos, gato4);
        gatos = animalService.cadastrarGato(gatos, gato5);

        gatos = animalService.adotarGatoViraLata(gatos);

        Fazenda fazenda = new Fazenda();
        FazendaService fazendaService = new FazendaService();
        fazendaService.adicionarCachorro(fazenda,cachorros);
        fazendaService.buscarCachorros(fazenda);
        fazendaService.adicionarGatos(fazenda,gatos);
        fazendaService.buscarGato(fazenda,1);
    }
}






















