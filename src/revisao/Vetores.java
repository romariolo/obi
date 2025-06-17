package revisao;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exemplo 1: Acesso e impressão de vetor fixo
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Exemplo 1 - Acesso e Impressão de Vetor:");
        System.out.println("Primeiro elemento: " + numeros[0]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

        System.out.println("\n--------------------------------------------------------\n");

        // Exemplo 2: Maior valor em vetor preenchido pelo usuário
        int[] numerosUsuario = new int[5];

        System.out.println("Exemplo 2 - Encontrar o Maior Valor:");
        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numerosUsuario[i] = sc.nextInt();
        }

        int maior = numerosUsuario[0];
        for (int i = 1; i < numerosUsuario.length; i++) {
            if (numerosUsuario[i] > maior) {
                maior = numerosUsuario[i];
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        System.out.println("\n--------------------------------------------------------\n");

        // Exemplo 3: Média de notas fixas
        System.out.println("Exemplo 3 - Média de Notas:");
        double[] notas = {7.5, 8.0, 6.0, 9.0, 7.0};
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double mediaNotas = somaNotas / notas.length;
        System.out.printf("A média das notas é: %.2f\n", mediaNotas);

        System.out.println("\n--------------------------------------------------------\n");

        // Exemplo 4: Média de 10 números digitados pelo usuário
        System.out.println("Exemplo 4 - Média de 10 Números:");
        double[] numerosMedia = new double[10];
        double somaNumeros = 0;

        for (int i = 0; i < numerosMedia.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosMedia[i] = sc.nextDouble();
            somaNumeros += numerosMedia[i];
        }

        double mediaNumeros = somaNumeros / numerosMedia.length;
        System.out.printf("A média é: %.2f\n", mediaNumeros);

        sc.close();
    }
}
