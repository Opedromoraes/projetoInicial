package aula_5.aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno guilherme = new Aluno("Guilherme", 658652, LocalDate.now().minusDays(5));
        Aluno romulo = new Aluno("Romulo", 658653, LocalDate.now().minusDays(4));
        Aluno pedro = new Aluno("Pedro", 658654, LocalDate.now().minusDays(3));

        imprimeInformacoes(guilherme);
        imprimeInformacoes(romulo);
        imprimeInformacoes(pedro);

        Escola freiOrlando = new Escola("Frei Orlando", "Alípio de Melo");
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(guilherme);
        alunos.add(romulo);
        alunos.add(pedro);

        freiOrlando.setAlunos(alunos);

        freiOrlando.getAlunos().forEach(aluno -> {
            System.out.printf("O aluno %s, estuda na escola %s", aluno.getNome(), freiOrlando.getNome());
            System.out.println();
        });
    }

    public static void imprimeInformacoes(Aluno aluno) {
        System.out.printf("O nome do aluno é %s sua matrícula é %d e ele se inscreveu em %s", aluno.getNome(), aluno.getMatricula(), aluno.getDataMatricula().toString());
        System.out.println();
    }
}
