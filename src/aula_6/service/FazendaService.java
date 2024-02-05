package aula_6.service;

import aula_6.model.Cachorro;
import aula_6.model.Fazenda;
import aula_6.model.Gato;

import java.util.List;

public class FazendaService {

    public void adicionarCachorro(Fazenda fazenda, List<Cachorro> cachorros) {
        fazenda.setCachorros(cachorros);
    }

    public void buscarCachorros(Fazenda fazenda) {
        fazenda.getCachorros().forEach(cachorro -> {
            System.out.printf("O cachorro da raça %s está na fazenda", cachorro.getRaca());
            System.out.println();
        });
    }
    public void adicionarGatos (Fazenda fazenda, List<Gato> gatos){
        fazenda.setGatos(gatos);
    }

    public void buscarGato (Fazenda fazenda,int indice){
        Gato gato = fazenda.getGatos().get(indice);
        System.out.printf("O gato escolhido foi o que tem a calda de %d cm",gato.getTamanhoDaCalda());
    }


























}
