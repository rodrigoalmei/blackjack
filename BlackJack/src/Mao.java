import java.util.ArrayList; //Armazenar as cartas na mão de um jogador ou do dealer

public class Mao {
    private ArrayList<Cartas> mao;

    // Construtor da classe Mao, que inicializa a lista de cartas na mão
    public Mao() {
        mao = new ArrayList<Cartas>();
    }

    // Método para adicionar uma carta à mão
    public void adicionarCarta(Cartas carta) {
        mao.add(carta); // Adiciona a carta fornecida à lista de cartas na mão
    }

    // Método para calcular o valor total da mão desde o começo
    public int calcularValorMao() {
        int valorTotal = 0; // Inicializa o valor total da mão como zero
        int numAses = 0; // Inicializa a contagem de Ases como zero

        // Itera sobre as cartas na mão
        for (Cartas carta : mao) {
            valorTotal += carta.getValor(); // Adiciona o valor da carta ao valor total

            if (carta.getRank() == Ranking.Rank.AS) {
                numAses++; // Se a carta for um Ás, aumenta a contagem de Ases
            }
        }

        // Ajuste o valor total se necessário para tratar os Ases
        while (valorTotal > 21 && numAses > 0) {
            valorTotal -= 10; // Reduz 10 do valor total (Ás passa de 11 para 1)
            numAses--; // Reduz a contagem de Ases tratados
        }

        return valorTotal; // Retorna o valor total da mão
    }

    // Método para obter a lista de cartas na mão
    public ArrayList<Cartas> getMao() {
        return mao; // Retorna a lista de cartas na mão
    }
    
}
