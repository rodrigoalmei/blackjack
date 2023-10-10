public class Cartas {
    // Declaração das variáveis de instância privadas
    private Ranking.Rank rank; // Representa o valor da carta (Rank)
    private Naipes naipe;     // Representa o naipe da carta

    // Construtor da classe Carta
    public Cartas(Ranking.Rank rank, Naipes naipe) {
        // Inicializa as variáveis de instância com os valores passados como argumentos
        this.rank = rank;
        this.naipe = naipe;
    }

    // Método público para obter o valor numérico da carta
    public int getValor() {
        return rank.getValor();
    }

    // Método público para obter o naipe da carta
    public Naipes getNaipe() {
        return naipe;
    }

    // Método público para obter o valor do Rank da carta
    public Ranking.Rank getRank() {
        return rank;
    }

    // Sobrescrita do método toString para criar uma representação de string da carta
    @Override
    public String toString() {
        // Retorna uma string no formato "[Rank de Naipe] (Valor)"
        return "[" + rank + " de " + naipe + "] (" + getValor() + ")";
    }
}
