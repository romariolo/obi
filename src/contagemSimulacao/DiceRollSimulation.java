package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;

public class DiceRollSimulation { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando DiceRollSimulation ---");
        Random random = new Random();
        int numeroDeSimulacoes = 1000;
        int contadorSoma7 = 0; // Variável para contagem

        System.out.println("Simulando " + numeroDeSimulacoes + " lançamentos de dois dados...");

        for (int i = 0; i < numeroDeSimulacoes; i++) {
            int dado1 = random.nextInt(6) + 1; // Dado 1: 1 a 6
            int dado2 = random.nextInt(6) + 1; // Dado 2: 1 a 6
            int soma = dado1 + dado2;

            if (soma == 7) {
                contadorSoma7++; // Incrementa a contagem se a soma for 7
            }
        }

        System.out.println("\n--- Resultados da Simulação ---");
        System.out.println("Total de lançamentos: " + numeroDeSimulacoes);
        System.out.println("Número de vezes que a soma foi 7: " + contadorSoma7);

        double probabilidadeEmpirica = (double) contadorSoma7 / numeroDeSimulacoes * 100;
        System.out.printf("Probabilidade empírica de obter soma 7: %.2f%%\n", probabilidadeEmpirica);

        // A probabilidade teórica de obter soma 7 com dois dados é 6/36 = 1/6 ≈ 16.67%
    }
}