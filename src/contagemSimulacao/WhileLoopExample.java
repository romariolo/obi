package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Scanner;

class WhileLoopExample {
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando WhileLoopExample ---");
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int tentativa;
        boolean acertou = false;
        int contadorTentativas = 0;

        System.out.println("Adivinhe o número secreto entre 1 e 10!");

        while (!acertou) { // Enquanto não acertou
            System.out.print("Sua tentativa: ");
            tentativa = scanner.nextInt();
            contadorTentativas++; // Incrementa o contador de tentativas

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + "!");
                acertou = true; // Altera a condição para sair do loop
            } else if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Muito alto. Tente novamente.");
            }
        }
        System.out.println("Você precisou de " + contadorTentativas + " tentativas para acertar.");
        scanner.close();
    }
}