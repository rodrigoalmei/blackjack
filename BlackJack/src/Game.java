import java.util.Scanner; //Receber as escolhas do jogador durante o jogo

public class Game {

    private Baralho baralhoPrincipal, pilhaDeDescarte;
    private Dealer dealer;
    private Jogador jogador;
    // Construtor da classe Game
    public Game(Scanner input) {
        baralhoPrincipal = new Baralho();
        pilhaDeDescarte = new Baralho(); //para não repetirem as cartas

        dealer = new Dealer(baralhoPrincipal); //Dealer fornecendo as cartas do jogo
        jogador = new Jogador(input, dealer); // Passe o Scanner e o Dealer para o construtor do Jogador

        baralhoPrincipal.shuffle();
        iniciarNovaRodada();
    }

    // Método para iniciar uma nova rodada
    public void iniciarNovaRodada() {
        iniciarRodada();
    }

    // Método para iniciar uma rodada de jogo
    private void iniciarRodada() {
        // Dar duas cartas para o dealer
        dealer.getMao().adicionarCarta(baralhoPrincipal.pegarCarta());
        dealer.getMao().adicionarCarta(baralhoPrincipal.pegarCarta());

        // Dar duas cartas para o jogador
        jogador.getMao().adicionarCarta(baralhoPrincipal.pegarCarta());
        jogador.getMao().adicionarCarta(baralhoPrincipal.pegarCarta());

        // Imprimir a mão do dealer e do jogador
        System.out.println("A mão do Dealer é:\n");
        dealer.printFirstHand(); // Imprimir a primeira carta do dealer
        System.out.println("A mão do(a) Jogador(a) é:\n");
        jogador.printMao();

        // Verificar se o dealer tem Blackjack
        if (dealer.temBlackjack()) {
            if (jogador.temBlackjack()) {
                System.out.println("Ambos têm Blackjack - Empate.");
            } else {
                System.out.println("O Dealer tem Blackjack. Você perde.");
            }
            return;
        }

        // Verificar se o jogador tem Blackjack
        if (jogador.temBlackjack()) {
            System.out.println("Você tem Blackjack! Você ganhou!");
            return;
        }

        // Continuar até que o jogador escolha parar
        jogador.tomarDecisao(baralhoPrincipal, pilhaDeDescarte);

        // Após o jogador parar, é a vez do dealer jogar
        dealerJogar();
    }

    // Método para lidar com a jogada do dealer
    private void dealerJogar() {
        // Continue até que o dealer atinja pelo menos 20 pontos ou estoure (soma maior que 21)
        while (true) {
            int valorMaoDealer = dealer.getMao().calcularValorMao();

            // Verificar se o dealer estourou (soma maior que 21) ou já tem 20 ou mais pontos
            if (valorMaoDealer > 21 || valorMaoDealer >= 20) {
                break;
            }

            // O dealer pega uma carta do baralho principal
            Cartas cartaNova = baralhoPrincipal.pegarCarta();
            dealer.getMao().adicionarCarta(cartaNova);
        }

        // Imprimir a mão final do dealer
        dealer.printMao();

        int valorMaoJogador = jogador.getMao().calcularValorMao();
        int valorMaoDealer = dealer.getMao().calcularValorMao();

        // Verificar o vencedor com base nas somas das mãos
        if (valorMaoJogador > 21) {
            System.out.println("Você estourou (soma maior que 21)! Dealer vence.\n");
        } else if (valorMaoDealer > 21 || valorMaoJogador > valorMaoDealer) {
            System.out.println("Você ganhou!\n");
        } else if (valorMaoJogador < valorMaoDealer) {
            System.out.println("Dealer vence.");
        } else {
            System.out.println("Empate.");
        }
    }
}
