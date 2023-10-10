// Classe que define os valores e nomes das cartas do baralho
public class Ranking {
    public enum Rank {
        AS("AS", 11),         // Carta Ás com valor 11
        DOIS("DOIS", 2),      // Carta 2 com valor 2
        TRES("TRÊS", 3),      // Carta 3 com valor 3
        QUATRO("QUATRO", 4),  // Carta 4 com valor 4
        CINCO("CINCO", 5),    // Carta 5 com valor 5
        SEIS("SEIS", 6),      // Carta 6 com valor 6
        SETE("SETE", 7),      // Carta 7 com valor 7
        OITO("OITO", 8),      // Carta 8 com valor 8
        NOVE("NOVE", 9),      // Carta 9 com valor 9
        DEZ("DEZ", 10),       // Carta 10 com valor 10
        VALETE("VALETE", 10), // Carta Valete com valor 10
        DAMA("DAMA", 10),     // Carta Dama com valor 10
        REI("REI", 10);       // Carta Rei com valor 10

        private String rankNome;   // Nome da carta (ex: "AS", "DOIS")
        private int rankValor;     // Valor da carta (ex: 11, 2, 3)

        // Construtor para Rank
        Rank(String rankNome, int rankValor) {
            this.rankNome = rankNome;   // Inicializa o nome da carta
            this.rankValor = rankValor; // Inicializa o valor da carta
        }

        // Método para obter o nome da carta
        public String toString() {
            return rankNome;
        }

        // Método para obter o valor da carta
        public int getValor() {
            return rankValor;
        }
    }

    // Método estático para calcular o valor total de uma mão de cartas
    public static int calcularValorTotal(Rank[] mao) {
        int valorTotal = 0;   // Inicializa o valor total como zero
        int numAces = 0;      // Inicializa o número de Áses como zero

        for (Rank carta : mao) {
            valorTotal += carta.getValor();  // Adiciona o valor da carta ao valor total
            if (carta == Rank.AS) {
                numAces++;  // Se a carta for um Ás, incrementa o número de Áses
            }
        }

        // Verifica se há Áses e se o valor total ultrapassou 21
        while (numAces > 0 && valorTotal > 21) {
            valorTotal -= 10;  // Reduz 10 do valor total para tratar os Áses como 1
            numAces--;         // Decrementa o número de Áses tratados
        }

        return valorTotal;  // Retorna o valor total da mão
    }
}
