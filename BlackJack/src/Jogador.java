import java.util.Scanner; //Lê a entrada do jogador

public class Jogador extends Pessoa {

    private Scanner input; // Adicione o Scanner como um atributo da classe Jogador
    // Construtor para criar um jogador
    public Jogador(Scanner input, Dealer dealer) {
        super(); // Chama o construtor da classe Pessoa
        super.setNome("Jogador"); // Define o nome do jogador como "Jogador"
        this.input = input; // Inicialize o Scanner com o parâmetro fornecido
    }

    // Método para tomar decisão
    public void tomarDecisao(Baralho baralhoPrincipal, Baralho pilhaDeDescarte) {
        int escolha = 0;

        // Calcula o valor total da mão desde o começo
        int valorMaoJogador = getMao().calcularValorMao();

        do {
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Bater (Pegar uma carta adicional)");
            System.out.println("2 - Parar (Manter a mão atual)");

            boolean getNum = true;

            // Loop até obter um número válido
            while (getNum) {
                try {
                    escolha = input.nextInt();
                    input.nextLine(); // Limpe a entrada do scanner

                    if (escolha == 1) {
                        // O jogador escolheu bater, então adicione uma carta à sua mão do baralho principal.
                        Cartas cartaNova = baralhoPrincipal.pegarCarta();
                        getMao().adicionarCarta(cartaNova);

                        // Imprimir a mão atual do jogador
                        System.out.println("Sua mão atual:\n");
                        printMao();

                        // Atualize o valor total da mão
                        valorMaoJogador = getMao().calcularValorMao();

                        // Verifique se o jogador tem blackjack ou estourou (soma maior que 21)
                        if (valorMaoJogador == 21) {
                            System.out.println("Você tem Blackjack!\n");
                            return; // Saia do método, pois o jogador atingiu 21
                        } else if (valorMaoJogador > 21) {
                            System.out.println("Você estourou (soma maior que 21)!\n");
                            return; // Saia do método, pois o jogador estourou
                        }
                    } else if (escolha == 2) {
                        // O jogador escolheu parar.
                        System.out.println("Você escolheu parar.\n");
                    } else {
                        System.out.println("\nEscolha inválida. Por favor, digite 1 para bater ou 2 para parar.");
                    }
                    getNum = false; // Saia do loop após obter uma entrada válida
                } catch (Exception e) {
                    System.out.println("\nEntrada inválida. Por favor, digite 1 para bater ou 2 para parar.");
                    input.nextLine(); // Limpe a entrada do scanner
                }
            }
        } while (escolha != 2); // Continuar perguntando até o jogador escolher parar
    }
}
