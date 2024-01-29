package aula_3;

import java.util.List;

public class Produto {
    // 3 atributos, nome, preço e quantidade
    // 4 métodos, 1- adicionar produto, 2- remove produto, 3- total valor em estoque, 4- printa produtos
    String nome;
    double preco;
    int quantidade;

    public List<Produto> adicionarProduto(List<Produto> produtos,Produto produto){
        produtos.add(produto);

        return produtos;
    }

    public List<Produto> removerProduto(List<Produto> produtos, int indice){
        produtos.remove(indice);

        return produtos;
    }


}
