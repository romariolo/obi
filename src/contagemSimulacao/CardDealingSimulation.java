package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDealingSimulation { // Deve ser public para ser acessível externamente se pacote for usado

    // Método para criar um baralho padrão
    public static List<String> criarBaralho() {
        List<String> baralho = new ArrayList<>();
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(valor + " de " + naipe);
            }
        }
        return baralho;
    }

    // Método para extrair o valor da carta para comparação (ex: "Ás", "Rei", "7")
    public static String extrairValorCarta(String carta) {
        String[] partes = carta.split(" de ");
        return partes[0];
    }

    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando CardDealingSimulation ---");
        Random random = new Random();
        int numCartasPorJogador = 5;
        int numJogos = 10; // Número de vezes para simular a distribuição
        int paresJogador1Total = 0;
        int paresJogador2Total = 0;

        System.out.println("Iniciando simulação de distribuição de cartas...");

        for (int jogo = 1; jogo <= numJogos; jogo++) {
            System.out.println("\n--- Jogo #" + jogo + " ---");
            List<String> baralho = criarBaralho();
            Collections.shuffle(baralho, random); // Embaralha o baralho usando o Random

            List<String> maoJogador1 = new ArrayList<>();
            List<String> maoJogador2 = new ArrayList<>();

            // Distribuir cartas
            for (int i = 0; i < numCartasPorJogador; i++) {
                if (!baralho.isEmpty()) {
                    maoJogador1.add(baralho.remove(0)); // Remove a primeira carta do baralho
                }
                if (!baralho.isEmpty()) {
                    maoJogador2.add(baralho.remove(0));
                }
            }

            System.out.println("Mão do Jogador 1: " + maoJogador1);
            System.out.println("Mão do Jogador 2: " + maoJogador2);

            // Contar pares
            int pares1 = contarPares(maoJogador1);
            int pares2 = contarPares(maoJogador2);

            System.out.println("Jogador 1 tem " + pares1 + " par(es).");
            System.out.println("Jogador 2 tem " + pares2 + " par(es).");

            paresJogador1Total += pares1;
            paresJogador2Total += pares2;
        }

        System.out.println("\n--- Resumo da Simulação ---");
        System.out.println("Total de jogos simulados: " + numJogos);
        System.out.println("Total de pares do Jogador 1 em " + numJogos + " jogos: " + paresJogador1Total);
        System.out.println("Total de pares do Jogador 2 em " + numJogos + " jogos: " + paresJogador2Total);
    }

    // Método para contar pares em uma mão
    public static int contarPares(List<String> mao) {
        int pares = 0;
        List<String> valoresVistos = new ArrayList<>();
        List<String> valoresComPar = new ArrayList<>(); // Para evitar contar o mesmo par múltiplas vezes

        for (String carta : mao) {
            String valor = extrairValorCarta(carta);
            if (valoresVistos.contains(valor) && !valoresComPar.contains(valor)) {
                pares++;
                valoresComPar.add(valor); // Marca que já contamos um par com este valor
            } else {
                valoresVistos.add(valor);
            }
        }
        return pares;
    }
}