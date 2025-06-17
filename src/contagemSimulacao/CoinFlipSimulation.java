package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;

public class CoinFlipSimulation { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando CoinFlipSimulation ---");
        Random random = new Random();
        int numeroDeLancamentos = 5000; // Aumentamos para ver a estabilização das probabilidades
        int caras = 0;
        int coroas = 0;

        System.out.println("Simulando " + numeroDeLancamentos + " lançamentos de moeda...");

        for (int i = 0; i < numeroDeLancamentos; i++) {
            // Gerar 0 para Cara, 1 para Coroa
            int resultado = random.nextInt(2); // Gera 0 ou 1

            if (resultado == 0) {
                caras++;
            } else {
                coroas++;
            }
        }

        System.out.println("\n--- Resultados da Simulação ---");
        System.out.println("Total de lançamentos: " + numeroDeLancamentos);
        System.out.println("Caras: " + caras);
        System.out.println("Coroas: " + coroas);

        double porcentagemCaras = (double) caras / numeroDeLancamentos * 100;
        double porcentagemCoroas = (double) coroas / numeroDeLancamentos * 100;

        System.out.printf("Porcentagem de Caras: %.2f%%\n", porcentagemCaras);
        System.out.printf("Porcentagem de Coroas: %.2f%%\n", porcentagemCoroas);
    }
}