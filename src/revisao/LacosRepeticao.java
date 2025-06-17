package revisao;

import java.util.Scanner;

public class LacosRepeticao {
    public static void main(String[] args) {
        // FOR de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // WHILE de 1 a 5
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // DO-WHILE de 1 a 5
        int i2 = 1;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 <= 5);

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // DO-WHILE para somar números até digitar 0
        Scanner sc = new Scanner(System.in);
        int somaNumeros = 0;
        int num;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            somaNumeros += num;
        } while (num != 0);

        System.out.println("Soma total: " + somaNumeros);

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // FOR para imprimir múltiplos de 3 entre 1 e 100
        System.out.println("Múltiplos de 3: \n");
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // FOR para somar os pares entre 1 e 50

        int somaPares = 0;
        for (int j = 1; j <= 50; j++) {
            if (j % 2 == 0) {
                somaPares += j;
            }
        }
        System.out.println("Soma dos números pares de 1 a 50: " + somaPares);

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // WHILE para calcular a média de notas
        System.out.println("Nota e sotuação:\n");
        double nota;
        double somaNotas = 0;
        int count = 0;

        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                count++;
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }
        }

        if (count > 0) {
            double media = somaNotas / count;
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }

        sc.close(); // Fecha o Scanner uma única vez, no final
    }
}
