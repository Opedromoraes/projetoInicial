package aula_5.livro;

public class Aula5 {
    public static void main(String[] args) {
        // construtores em java, datas em java, objetos dentro de objetos.

        Livro livro = new Livro("Guilherme");
        Livro livro1 = new Livro("João e Maria", "Jose");

        System.out.printf("O título do livro é %s e o autor é o %s", livro.getTitulo(), livro.getAutor());
        System.out.println();
        System.out.printf("O título do livro é %s e o autor é o %s", livro1.getTitulo(), livro1.getAutor());
        System.out.println();

        livro.setAutor("Pedro");
        livro.setTitulo("A menina que roubava construtores");

        System.out.printf("O título do livro é %s e o autor é o %s", livro.getTitulo(), livro.getAutor());
        System.out.println();
        System.out.printf("O título do livro é %s e o autor é o %s", livro1.getTitulo(), livro1.getAutor());

    }
}
