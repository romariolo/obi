package contagemSimulacao;

import java.util.Scanner;
import java.util.Random;

public class AdivinheONumeroSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Random random = new Random();             // Cria um objeto Random para gerar números

        int jogosJogados = 0;              // Contador para o total de jogos jogados
        int jogosAcertadosNaPrimeira = 0;  // Contador para jogos acertados na primeira tentativa
        int jogosFalhos = 0;               // Contador para jogos onde o usuário não acertou no limite
        int totalTentativasAcertadas = 0;  // Soma das tentativas de todos os jogos vencidos
        int totalJogosAcertados = 0;       // Contador para o total de jogos que foram vencidos

        System.out.println("Bem-vindo ao Adivinhe o Número!");

        boolean jogarNovamente = true; // Variável de controle para jogar múltiplas vezes
        while (jogarNovamente) {       // Loop principal para permitir vários jogos
            jogosJogados++;                              // Incrementa o contador de jogos jogados
            int numeroSecreto = random.nextInt(10) + 1;  // Gera um novo número secreto entre 1 e 10
            int tentativa;                               // Variável para armazenar a tentativa do usuário
            boolean acertou = false;                     // Flag para verificar se o usuário acertou
            int contadorTentativas = 0;                  // Contador de tentativas por jogo
            final int LIMITE_TENTATIVAS = 5;             // Define o limite de tentativas por jogo

            System.out.println("\n--- Começando o Jogo #" + jogosJogados + " ---");
            System.out.println("Adivinhe o número secreto entre 1 e 10. Você tem " + LIMITE_TENTATIVAS + " chances.");

            /*
             * Loop para o jogo individual: continua enquanto o usuário não acertar
             * e enquanto houver tentativas restantes.
             */
            while (!acertou && contadorTentativas < LIMITE_TENTATIVAS) {
                System.out.print("Sua tentativa (" + (contadorTentativas + 1) + "/" + LIMITE_TENTATIVAS + "): ");
                tentativa = scanner.nextInt(); // Lê a tentativa do usuário
                contadorTentativas++;          // Incrementa o contador de tentativas

                if (tentativa == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número " + numeroSecreto + "!");
                    acertou = true; // Define acertou como true para sair do loop
                } else if (tentativa < numeroSecreto) {
                    System.out.println("É muito baixo. Tente um número maior.");
                } else {
                    System.out.println("É muito alto. Tente um número menor.");
                }
            }

            // Verifica se o usuário acertou ou falhou no jogo atual
            if (acertou) {
                System.out.println("Você precisou de " + contadorTentativas + " tentativa(s).");
                totalTentativasAcertadas += contadorTentativas; // Soma as tentativas do jogo vencido
                totalJogosAcertados++;                          // Incrementa o contador de jogos vencidos
                if (contadorTentativas == 1) {
                    jogosAcertadosNaPrimeira++; // Incrementa se acertou na primeira tentativa
                }
            } else {
                System.out.println("Que pena! Você não adivinhou o número " + numeroSecreto + " dentro de " + LIMITE_TENTATIVAS + " tentativas.");
                jogosFalhos++; // Incrementa o contador de jogos falhos
            }

            // Pergunta ao usuário se ele quer jogar novamente
            System.out.print("Quer jogar de novo? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) { // Se a resposta não for 's' (ignorando maiúsculas/minúsculas)
                jogarNovamente = false;            // Altera a variável para sair do loop principal
            }
        }

        /*
         * Bloco para exibir as estatísticas finais após todos os jogos.
         */
        System.out.println("\n--- Estatísticas Finais ---");
        System.out.println("Total de jogos jogados: " + jogosJogados);
        System.out.println("Jogos acertados na primeira tentativa: " + jogosAcertadosNaPrimeira);
        System.out.println("Jogos que você não conseguiu adivinhar: " + jogosFalhos);

        // Calcula e exibe a média de tentativas se houver jogos vencidos
        if (totalJogosAcertados > 0) {
            double mediaTentativas = (double) totalTentativasAcertadas / totalJogosAcertados;
            // Formata a média com duas casas decimais
            System.out.printf("Média de tentativas por jogo (nos que você acertou): %.2f%n", mediaTentativas);
        } else {
            System.out.println("Nenhum jogo foi acertado para calcular a média de tentativas.");
        }

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
        System.out.println("Obrigado por jogar!");
    }
}