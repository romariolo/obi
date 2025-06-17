package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;

public class RouletteSimulation { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando RouletteSimulation ---");
        Random random = new Random();
        long totalGiros = 1000000; // Número de vezes que vamos girar a roleta
        int numeroApostado = 7; // Nosso número da sorte
        int girosVencedores = 0; // Contador de vezes que nosso número ganhou

        // Uma roleta americana tem 38 "bolsos": 1 a 36, 0 e 00.
        // Vamos representar 0 como 0, e 00 como 37 para simplificar a lógica de índice.
        int totalBolsosRoleta = 38;

        System.out.println("Simulando " + totalGiros + " giros de roleta...");
        System.out.println("Apostando no número: " + numeroApostado);

        for (long i = 0; i < totalGiros; i++) {
            // Gerar um número aleatório de 0 a 37 (totalBolsosRoleta - 1)
            // Se o resultado for 0, é o bolso '0'
            // Se o resultado for 37, é o bolso '00'
            // Qualquer outro resultado (1 a 36) é o número correspondente
            int resultadoGiro = random.nextInt(totalBolsosRoleta);

            // Adaptar o resultado para nosso número apostado
            // Se o número apostado for 0, verificamos se resultadoGiro é 0
            // Se o número apostado for de 1 a 36, verificamos se resultadoGiro é igual ao numeroApostado
            boolean ganhou = false;
            if (numeroApostado == 0 && resultadoGiro == 0) {
                ganhou = true;
            } else if (numeroApostado >= 1 && numeroApostado <= 36 && resultadoGiro == numeroApostado) {
                ganhou = true;
            }
            // Não estamos apostando no '00' neste exemplo para manter a simplicidade

            if (ganhou) {
                girosVencedores++; // Incrementa a contagem de vitórias
            }
        }

        System.out.println("\n--- Resultados da Simulação ---");
        System.out.println("Total de giros simulados: " + totalGiros);
        System.out.println("Número de vezes que " + numeroApostado + " ganhou: " + girosVencedores);

        // Calcular a probabilidade empírica
        double probabilidadeEmpirica = (double) girosVencedores / totalGiros * 100;
        System.out.printf("Probabilidade empírica de ganhar com " + numeroApostado + ": %.4f%%\n", probabilidadeEmpirica);

        // Probabilidade teórica de ganhar na roleta americana (1/38)
        double probabilidadeTeorica = (1.0 / totalBolsosRoleta) * 100;
        System.out.printf("Probabilidade teórica de ganhar: %.4f%%\n", probabilidadeTeorica);
        System.out.printf("Diferença (Teórica - Empírica): %.4f%%\n", probabilidadeTeorica - probabilidadeEmpirica);
    }
}