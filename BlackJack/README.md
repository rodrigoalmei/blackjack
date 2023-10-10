# Jogo de Blackjack em Java

## Descrição do Jogo

O jogo de Blackjack, também conhecido como 21, é um jogo de cartas popular em cassinos. O objetivo principal do jogo é acumular cartas com um valor total de 21 ou o mais próximo possível deste valor, sem ultrapassá-lo. Os jogadores competem contra o dealer (a casa), e o vencedor é aquele que obtiver a melhor mão.

## Funcionamento do Jogo

O jogo foi implementado em Java e consiste em várias classes que representam diferentes elementos do jogo:

- **Baralho**: Responsável por criar, embaralhar e distribuir cartas.
- **Cartas**: Representa uma carta individual com um valor e um naipe.
- **Dealer**: O dealer, que controla as ações do jogo da casa.
- **Game**: Responsável por orquestrar o jogo, permitindo que os jogadores interajam e controlando o fluxo do jogo.
- **Jogador**: O jogador, que toma decisões durante o jogo.
- **Mao**: Representa a mão de um jogador ou do dealer.
- **Naipes**: Enumeração que define os quatro naipes das cartas.
- **Pessoa**: Uma classe abstrata que contém informações comuns a jogadores e ao dealer.
- **Ranking**: Define os valores das cartas (Ás, 2, 3, ..., Rei).

## Como Jogar

1. **Iniciar o Jogo**: Execute o jogo a partir da classe `Main`. O programa iniciará uma nova rodada automaticamente.

2. **Receber Cartas**: O dealer distribuirá duas cartas para cada jogador, com uma das cartas dele virada para baixo.

3. **Tomar Decisões**: O jogador "Rodrigo" terá a oportunidade de escolher entre "Bater" (pegar uma carta adicional) ou "Parar" (manter a mão atual). O objetivo é obter uma mão com um valor próximo a 21 sem ultrapassá-lo.

4. **Dealer Joga**: Após a vez do jogador, o dealer jogará automaticamente de acordo com as regras do jogo, tentando obter um valor próximo a 21.

5. **Determinar o Vencedor**: O resultado da rodada será determinado com base nas somas das mãos do jogador e do dealer. O jogador ganha se sua mão tiver um valor mais alto que a do dealer e não ultrapassar 21.

6. **Repetir ou Encerrar**: O jogo permite que você jogue várias rodadas consecutivas. O vencedor acumula pontos (ganhos) e pode continuar jogando até optar por encerrar.

## Requisitos

Certifique-se de ter o ambiente Java configurado para executar o jogo. Você pode executar o jogo a partir da classe `Main`.

Divirta-se jogando Blackjack!

---