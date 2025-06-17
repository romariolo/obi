package funcoes;

public class BoletimEscolar {

    // Função 1: Focada em apenas UMA coisa: calcular a média.
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Função 2: Focada em outra coisa: verificar a situação do aluno.
    public static String verificarSituacao(double mediaFinal) {
        if (mediaFinal >= 7.0) {
            return "✅ Aprovado! Boas férias!";
        } else if (mediaFinal >= 5.0) {
            return "⚠️ Recuperação! Ainda há uma chance!";
        } else {
            return "❌ Reprovado. Nos vemos no próximo ano.";
        }
    }

    public static void main(String[] args) {
        // --- Cenário do Aluno 1: Carlos ---
        double notaProva1 = 8.0;
        double notaProva2 = 9.0;

        double mediaDoCarlos = calcularMedia(notaProva1, notaProva2);
        String situacaoDoCarlos = verificarSituacao(mediaDoCarlos);

        System.out.println("Aluno: Carlos");
        System.out.println("Média final: " + mediaDoCarlos);
        System.out.println("Situação: " + situacaoDoCarlos);

        System.out.println("\n-----------------------------------\n");

        // --- Cenário do Aluno 2: Bruna ---
        double notaBruna1 = 4.0;
        double notaBruna2 = 6.5;

        double mediaDaBruna = calcularMedia(notaBruna1, notaBruna2);

        System.out.println("Aluna: Bruna");
        System.out.println("Média final: " + mediaDaBruna);
        System.out.println("Situação: " + verificarSituacao(mediaDaBruna));
    }
}