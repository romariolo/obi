package funcoes;

public class AnalisadorDeNotas {

    // Calcula a média de uma lista de notas.
    public static double calcularMediaDeVariasNotas(double[] notasDoAluno) {
        if (notasDoAluno.length == 0) {
            return 0.0;
        }

        double somaTotal = 0;
        for (double nota : notasDoAluno) {
            somaTotal += nota;
        }

        return somaTotal / notasDoAluno.length;
    }

    // Encontra a maior nota em uma lista.
    public static double encontrarMaiorNota(double[] notasDoAluno) {
        if (notasDoAluno.length == 0) {
            return 0.0;
        }

        double maiorNota = notasDoAluno[0];
        for (double nota : notasDoAluno) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

    public static void main(String[] args) {
        double[] notasJulia = {8.5, 9.0, 7.5, 10.0, 6.5};
        double[] notasRicardo = {5.0, 6.0, 5.5};

        double mediaJulia = calcularMediaDeVariasNotas(notasJulia);
        double maiorNotaJulia = encontrarMaiorNota(notasJulia);

        System.out.println("--- Boletim de Júlia ---");
        System.out.printf("Média final: %.2f\n", mediaJulia);
        System.out.println("Sua maior nota foi: " + maiorNotaJulia);

        System.out.println("\n--- Boletim de Ricardo ---");
        double mediaRicardo = calcularMediaDeVariasNotas(notasRicardo);
        double maiorNotaRicardo = encontrarMaiorNota(notasRicardo);
        System.out.printf("Média final: %.2f\n", mediaRicardo);
        System.out.println("Sua maior nota foi: " + maiorNotaRicardo);
    }
}