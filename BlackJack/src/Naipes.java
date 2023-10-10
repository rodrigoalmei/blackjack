// Enumeração Naipes representa os quatro naipes das cartas de baralho
public enum Naipes {
    PAUS("PAUS"),      // O primeiro naipe é PAUS
    OURO("OURO"),      // O segundo naipe é OURO
    COPAS("COPAS"),    // O terceiro naipe é COPAS
    ESPADA("ESPADA");  // O quarto naipe é ESPADA

    String baralhoNome; // Declara uma variável para armazenar o nome do naipe no baralho

    // Construtor da enumeração Naipes, que associa um nome de naipe ao valor
    Naipes(String baralhoNome) {
        this.baralhoNome = baralhoNome; // Inicializa a variável de nome do naipe
    }

    // Método toString sobrescrito para retornar o nome do naipe quando convertido para String
    public String toString() {
        return baralhoNome; // Retorna o nome do naipe quando convertido para String
    }
}
