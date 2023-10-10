import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Main {
    public static void main(String[] args) throws Exception { // Método principal (ponto de entrada do programa)
        System.out.println("\nBem Vindo(a) ao Black Jack!\n"); // Imprime uma mensagem de boas-vindas

        Scanner scanner = new Scanner(System.in); // Inicializa um objeto Scanner para entrada do usuário

        // Cria um novo objeto Game, passando o Scanner como argumento
        Game blackjack = new Game(scanner);

    }
}
