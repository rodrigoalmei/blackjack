import java.util.List; //Serve para que o código acesse e manipule a mão do Dealer
//Trabalhará com listas de objetos.'List<Cartas>' 

public class Dealer extends Pessoa {
    // Construtor da classe Dealer
    public Dealer(Baralho baralhoPrincipal) {
        super(); // Chama o construtor da classe base (Pessoa)
        super.setNome("Dealer"); // Define o nome do dealer como "Dealer"
    }

    // Método para iniciar a mão do dealer (sem adicionar cartas)
    public void iniciarMao() {
        // Na primeira rodada que será adicionada cartas á mão do Dealer
    }

    /**
     * Imprime a primeira mão do dealer, com uma carta virada para baixo.
     */
    public void printFirstHand() {
        List<Cartas> mao = super.getMao().getMao();
        System.out.println(mao.get(0)); // Imprime a primeira carta do dealer (virada para cima)
        System.out.println("[Carta virada para baixo]\n"); // Imprime uma carta virada para baixo
    }

    /**
     * Calcula o valor total da mão do dealer.
     * @return O valor total da mão do dealer.
     */
    public int calcularValorMao() {
        List<Cartas> mao = super.getMao().getMao();
        int valorTotal = 0;
        int numAses = 0;

        // Itera sobre as cartas na mão do dealer (percorre todas as cartas do dealer)
        for (Cartas carta : mao) {
            valorTotal += carta.getValor(); // Soma o valor da carta ao valor total

            if (carta.getRank() == Ranking.Rank.AS) {
                numAses++; // Conta quantos Ases o dealer tem na mão
            }
        }

        // Ajusta o valor total se houver Ases e a soma for maior que 21
        while (valorTotal > 21 && numAses > 0) {
            valorTotal -= 10; // Reduz 10 do valor total (um Ás conta como 11)
            numAses--; // Decrementa o contador de Ases
        }

        return valorTotal; // Retorna o valor total da mão do dealer
    }
}
