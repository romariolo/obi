package revisao;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 20;

        // Verificação de idade para entrada em festa
        if (idade >= 18) {
            System.out.println("✅ Pode entrar na festa!");
        } else if (idade >= 16) {
            System.out.println("🟡 Pode entrar com acompanhante.");
        } else {
            System.out.println("❌ Entrada proibida.");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        idade = 25;

        // Verificação de idade ativa para trabalho
        if (idade >= 18 && idade <= 60) {
            System.out.println("💼 Está em idade ativa de trabalho.");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        String estado = "RJ";

        // Verificação de estado na região Sudeste
        if (estado.equals("SP") || estado.equals("RJ")) {
            System.out.println("🗺️ Região Sudeste");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        boolean semPermissao = true;

        // Verificação de permissão
        if (semPermissao) {
            System.out.println("⛔ Ação não permitida. Solicite acesso ao administrador.");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        idade = 70;

        // Verificação de faixa etária permitida
        if (idade > 60 || idade < 18) {
            System.out.println("🚫 Fora da faixa permitida");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        int dia = 3;

        // Verificação do dia da semana com switch
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // Verificação de par ou ímpar
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // Comparação entre dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }

        System.out.println("\n\n--------------------------------------------------------\n\n");

        // Verificação de nota
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else if (nota < 6) {
            System.out.println("Reprovado");
        } else if (nota <= 7.5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
