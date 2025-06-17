package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberImproved { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando GuessTheNumberImproved ---");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalJogos = 0;
        int totalVitorias = 0;
        int totalTentativasAcumuladas = 0;
        int limiteTentativas = 5; // Limite de tentativas por jogo

        System.out.println("Bem-vindo ao Adivinhe o Número (Melhorado)!");

        String jogarNovamente = "sim";
        while (jogarNovamente.equalsIgnoreCase("sim")) {
            totalJogos++;
            int numeroSecreto = random.nextInt(10) + 1; // Número entre 1 e 10
            int tentativasNoJogoAtual = 0;
            boolean acertou = false;

            System.out.println("\n--- Jogo #" + totalJogos + " ---");
            System.out.println("Estou pensando em um número entre 1 e 10. Você tem " + limiteTentativas + " tentativas.");

            while (tentativasNoJogoAtual < limiteTentativas && !acertou) {
                System.out.print("Tentativa #" + (tentativasNoJogoAtual + 1) + ": ");
                int tentativa = scanner.nextInt();
                tentativasNoJogoAtual++;

                if (tentativa == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativasNoJogoAtual + " tentativas!");
                    acertou = true;
                    totalVitorias++;
                    totalTentativasAcumuladas += tentativasNoJogoAtual;
                } else if (tentativa < numeroSecreto) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else {
                    System.out.println("Muito alto. Tente novamente.");
                }
            }

            if (!acertou) {
                System.out.println("Suas " + limiteTentativas + " tentativas acabaram! O número secreto era: " + numeroSecreto);
            }

            System.out.print("Deseja jogar novamente? (sim/não): ");
            scanner.nextLine(); // Consumir a nova linha pendente
            jogarNovamente = scanner.nextLine();
        }

        System.out.println("\n--- Resumo Final ---");
        System.out.println("Total de jogos jogados: " + totalJogos);
        System.out.println("Total de vitórias: " + totalVitorias);
        System.out.println("Total de derrotas: " + (totalJogos - totalVitorias));

        if (totalVitorias > 0) {
            double mediaTentativasPorVitoria = (double) totalTentativasAcumuladas / totalVitorias;
            System.out.printf("Média de tentativas por vitória: %.2f\n", mediaTentativasPorVitoria);
        } else {
            System.out.println("Nenhuma vitória registrada para calcular a média de tentativas.");
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}