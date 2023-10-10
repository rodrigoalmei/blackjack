import java.util.ArrayList;      // Armazenar as cartas do baralho
import java.util.Collections;    // Para o método shuffle(que vai embaralhar)
import java.util.List;           // Representar o baralho
import java.util.Random;         // Embaralhar as cartas no shuffle


public class Baralho {
    private List<Cartas> baralho; // Lista que armazena as cartas do baralho

    public Baralho() {
        baralho = new ArrayList<>(); // Inicializa a lista de cartas como um ArrayList vazio
                                    //Vai ser utilizado para armazenar uma coleção ordenada de cartas
        for (Naipes naipe : Naipes.values()) {
            for (Ranking.Rank rank : Ranking.Rank.values()) {
                // Laços aninhados para criar todas as combinações de cartas (naipe e valor)
                // e adicioná-las ao baralho
                baralho.add(new Cartas(rank, naipe));
            }
        }
    }

    public void shuffle() {
        // Método para embaralhar as cartas no baralho
        Collections.shuffle(baralho, new Random());
    }

    //Checar se o baralho está vazio
    public Cartas pegarCarta() {
        if (baralho.isEmpty()) {
            return null; // Se o baralho estiver vazio, retorna null (nenhuma carta disponível)
        }

        return baralho.remove(0); // Remove e retorna a primeira carta do baralho p/ nao repetir
  
    }
    
}
