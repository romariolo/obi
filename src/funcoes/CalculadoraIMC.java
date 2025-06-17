package funcoes;

import java.util.Locale; // PASSO 1: Importar a classe Locale
import java.util.Scanner;

public class CalculadoraIMC {

    // As funções continuam exatamente as mesmas...
    public static void exibirBoasVindas() {
        System.out.println("*************************************");
        System.out.println("* Bem-vindo à Calculadora de IMC      *");
        System.out.println("*************************************");
    }

    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            return 0;
        }
        return peso / (altura * altura);
    }

    public static String obterClassificacaoIMC(double imc) {
        if (imc <= 0) return "Inválido";
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 24.9) return "Peso normal";
        if (imc < 29.9) return "Sobrepeso";
        if (imc < 34.9) return "Obesidade Grau I";
        if (imc < 39.9) return "Obesidade Grau II";
        return "Obesidade Grau III (mórbida)";
    }

    public static void main(String[] args) {
        exibirBoasVindas();

        // PASSO 2: Modificar a criação do Scanner para usar o padrão US (ponto decimal)
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = leitor.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = leitor.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = obterClassificacaoIMC(imc);

        System.out.printf("\nOlá, %s! Seu IMC calculado é: %.2f\n", nome, imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("\nObrigado por usar a calculadora!");

        leitor.close();
    }
}