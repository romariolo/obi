package funcoes;

import java.util.Scanner;
import java.util.Random;

public class JogoJokenpo {

    // Gera a jogada do computador de forma aleatória.
    public static String gerarJogadaComputador() {
        Random random = new Random();
        int escolha = random.nextInt(3); // Gera 0, 1 ou 2
        switch (escolha) {
            case 0: return "pedra";
            case 1: return "papel";
            default: return "tesoura";
        }
    }

    // Determina o vencedor com base nas jogadas.
    public static String determinarVencedor(String jogadaUsuario, String jogadaComputador) {
        if (jogadaUsuario.equals(jogadaComputador)) {
            return "É um empate! 🤝";
        }

        boolean usuarioVenceu = (jogadaUsuario.equals("pedra") && jogadaComputador.equals("tesoura")) ||
                (jogadaUsuario.equals("tesoura") && jogadaComputador.equals("papel")) ||
                (jogadaUsuario.equals("papel") && jogadaComputador.equals("pedra"));

        if (usuarioVenceu) {
            return "Você venceu! 🎉";
        } else {
            return "O computador venceu! 💻";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFaça sua jogada: pedra, papel ou tesoura? (ou 'sair' para terminar)");
            String jogadaUsuario = scanner.nextLine().toLowerCase();

            if (jogadaUsuario.equals("sair")) {
                System.out.println("Obrigado por jogar! Até a próxima!");
                break;
            }

            if (!jogadaUsuario.equals("pedra") && !jogadaUsuario.equals("papel") && !jogadaUsuario.equals("tesoura")) {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            String jogadaComputador = gerarJogadaComputador();
            System.out.println("O computador jogou: " + jogadaComputador);

            String resultado = determinarVencedor(jogadaUsuario, jogadaComputador);
            System.out.println(resultado);
        }

        scanner.close();
    }
}