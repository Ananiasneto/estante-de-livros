
import java.util.Scanner;

public class Estante {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Inserir dados do usuário
        System.out.println("INSERIR DADOS");
        System.out.println("--------------------");
        System.out.print("Insira seu nome: ");
        String nome = sc.next();
        sc.nextLine(); // consome a linha pendente
        System.out.print("Insira seu username: ");
        String username = sc.next();
        sc.nextLine(); // consome a linha pendente
        System.out.print("Nota do livro (1 a 10): ");
        double nota = sc.nextDouble();
        sc.nextLine(); // consome a linha pendente
        System.out.print("Comentário sobre o livro: ");
        String comentario = sc.nextLine();

        // Instanciação do objeto Usuario
        Usuario usuario = new Usuario(nome, username, comentario, nota);

        // Print do usuário
        System.out.println(usuario.imprimirUsuario());

        sc.close();

    }
}
