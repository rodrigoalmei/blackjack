// Classe abstrata Pessoa representa um jogador ou o dealer do jogo de Blackjack
public abstract class Pessoa {

    private Mao mao;      // Uma instância da classe Mao para representar a mão da Pessoa

    // Construtor padrão da classe Pessoa
    public Pessoa() {
        this.mao = new Mao();  // Inicializa a mão como uma nova instância de Mao
    }

    // Método para obter a mão da Pessoa
    public Mao getMao() {
        return this.mao;       // Retorna a instância da mão da Pessoa
    }

    // Método para definir a mão da Pessoa
    public void setMao(Mao mao) {
        this.mao = mao;         // Define a instância da mão da Pessoa
    }

    // Método para definir o nome da Pessoa
    public void setNome(String nome) {
        //this.nome = nome;       // Define o nome da Pessoa
    }

    // Método para verificar se a Pessoa tem um Blackjack
    public boolean temBlackjack() {
        return this.mao.calcularValorMao() == 21;  // Verifica se o valor da mão é igual a 21
    }

    // Método para imprimir a mão da Pessoa
    public void printMao() {
        for (Cartas carta : this.mao.getMao()) {
            System.out.println(carta.toString());  // Imprime cada carta na mão da Pessoa
        }
        System.out.println("Valor da Mão: " + this.mao.calcularValorMao());  // Imprime o valor total da mão
    }
}
