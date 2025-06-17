package contagemSimulacao;

import java.util.Random;

public class RandomExample { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando RandomExample ---");
        Random gerador = new Random(); // Cria uma instância do gerador de números aleatórios

        System.out.println("Gerando números aleatórios:");

        // Gerar um número inteiro aleatório
        int numeroInteiro = gerador.nextInt(); // Gera um int qualquer (positivo ou negativo)
        System.out.println("Número inteiro aleatório (qualquer): " + numeroInteiro);

        // Gerar um número inteiro aleatório entre 0 (inclusive) e N (exclusive)
        // Ex: entre 0 e 5 (0, 1, 2, 3, 4)
        int dadoFace = gerador.nextInt(6); // 0 a 5
        System.out.println("Face de um dado (0 a 5): " + dadoFace);

        // Para gerar um número entre 1 e N (inclusive), somamos 1:
        int dadoFaceReal = gerador.nextInt(6) + 1; // 1 a 6
        System.out.println("Face de um dado (1 a 6): " + dadoFaceReal);

        // Gerar um número float/double aleatório entre 0.0 (inclusive) e 1.0 (exclusive)
        double probabilidade = gerador.nextDouble();
        System.out.println("Probabilidade (0.0 a 1.0): " + probabilidade);

        System.out.println("\nSimulando 5 lançamentos de um dado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Lançamento " + (i + 1) + ": " + (gerador.nextInt(6) + 1));
        }
    }
}