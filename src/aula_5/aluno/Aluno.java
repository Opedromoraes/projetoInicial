package aula_5.aluno;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private int matricula;
    private LocalDate dataMatricula;

    public Aluno(String nome, int matricula, LocalDate dataMatricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
