package br.escola.bibliohaydee.app;
import java.util.Scanner;
import br.escola.bibliohaydee.model.Autor;
import br.escola.bibliohaydee.model.Livro;
import br.escola.bibliohaydee.model.Usuario;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Sarah J. Maas");
        autor.setNacionalidade("Norte-Americana");
        autor.setAnoNascimento(1986);

        ArrayList<Autor> autores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String nome;

        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            if (nome.trim().isEmpty()) {
                System.out.println("O nome não pode ser vazio.");
            }

        } while (nome.trim().isEmpty());

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        String tipo;

        do {
            System.out.print("Digite o tipo (ALUNO ou PROFESSOR): ");
            tipo = scanner.nextLine().toUpperCase();

            if (!tipo.equals("ALUNO") && !tipo.equals("PROFESSOR")) {
                System.out.println("Tipo inválido. Digite ALUNO ou PROFESSOR.");
            }

        } while (!tipo.equals("ALUNO") && !tipo.equals("PROFESSOR"));

        System.out.print("Digite o limite de empréstimos: ");
        int limite = Integer.parseInt(scanner.nextLine());
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario(nome, matricula, tipo, limite);

        usuarios.add(usuario);
        autores.add(autor);
        Autor autor2 = new Autor();
        autor2.setNome("Colleen Hoover");
        autor2.setNacionalidade("Norte-Americana");
        autor2.setAnoNascimento(1979);
        autores.add(autor2);
        Livro livro = new Livro("Corte de Espinhos e Rosas", "123456", autor, 2026, "Romance");

        Livro livro2 = new Livro("É Assim que Acaba", "123457", autor2, 2018, "Romance");

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro);
        livros.add(livro2);

        System.out.println(livros);
        System.out.println(autores);
        System.out.println(livro);
        System.out.println(livro2);
        System.out.println(autor);
        System.out.println(usuarios);

    }
} 