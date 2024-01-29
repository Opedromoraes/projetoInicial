package aula_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula4 {
    public static void main(String[] args) {
        // 3 atributos, nome, preço e quantidade
        // 4 métodos, 1- adicionar produto, 2- remove produto, 3- total valor em estoque, 4- printa produtos

        List<Produto2> produtos = new ArrayList<>();

        Produto2 produto = new Produto2();
        produto.nome = "barbecue";
        produto.preco = 12.20;
        produto.quantidade = 2;

        Produto2 produto1 = new Produto2();
        produto1.nome = "camisinha PP de sabor";
        produto1.preco = 155012.98;
        produto1.quantidade = 1;

        adicionarProduto(produtos, produto);
        adicionarProduto(produtos, produto1);
        removerProduto(produtos, "agua");
        printaProdutos(produtos);

        System.out.println(calculaEstoque(produtos));
    }

    public static List<Produto2> adicionarProduto(List<Produto2> produtos, Produto2 produto) {
        produtos.add(produto);
        return produtos;
    }

    public static List<Produto2> removerProduto(List<Produto2> produtos, String nome) {
        produtos.forEach(produto -> {
            if (produto.nome.equals(nome)) {
                produtos.remove(produto);
            }
        });
        return produtos;
    }

    public static long calculaEstoque(List<Produto2> produtos) {
        long resultados = produtos.stream().map(produto2 -> {
            return produto2.quantidade;
        }).collect(Collectors.toList()).stream().reduce(Long::sum).get();
        return resultados;
    }
    public static void printaProdutos(List<Produto2> produtos) {
        produtos.forEach(produto -> {
            System.out.printf("o produto %s custa R$%.2f e vamos levar %d unidades", produto.nome, produto.preco, produto.quantidade);
            System.out.println();
        });
    }


}
