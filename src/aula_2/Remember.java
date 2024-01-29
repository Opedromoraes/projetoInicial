package aula_2;

import java.util.ArrayList;
import java.util.List;

public class Remember {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        adicionarTarefas(tarefas, "Lavar o carro");
        adicionarTarefas(tarefas, "Limpar o banheiro");
        adicionarTarefas(tarefas, "Fazer cocô antes de tomar banho");
        removerTarefas(tarefas);
        listarTarefas(tarefas);
    }

    public static List<String> adicionarTarefas(List<String> tarefas, String tarefa) {
        tarefas.add(tarefa);

        return tarefas;
    }

    public static List<String> removerTarefas(List<String> tarefas) {
        tarefas.removeAll(tarefas);

        return tarefas;

    }

    public static void listarTarefas(List<String> tarefas) {
        tarefas.forEach(tarefa -> {
            System.out.println(tarefa);
        });
    }
}
