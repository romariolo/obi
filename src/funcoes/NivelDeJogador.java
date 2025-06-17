package funcoes;

public class NivelDeJogador {

    // Esta função recebe os pontos de XP e devolve o título do jogador.
    public static String obterNivel(int xp) {
        if (xp < 1000) {
            return "Bronze 🥉";
        } else if (xp < 2500) {
            return "Prata 🥈";
        } else if (xp < 5000) {
            return "Ouro 🥇";
        } else if (xp < 10000) {
            return "Platina 💎";
        } else {
            return "Lendário 🔥";
        }
    }

    public static void main(String[] args) {
        int pontuacaoJogador1 = 500;
        int pontuacaoJogador2 = 4500;
        int pontuacaoJogador3 = 20000;

        // Para cada jogador, chamamos a MESMA função para descobrir seu nível.
        String nivelJogador1 = obterNivel(pontuacaoJogador1);
        String nivelJogador2 = obterNivel(pontuacaoJogador2);
        String nivelJogador3 = obterNivel(pontuacaoJogador3);

        System.out.println("O Jogador 1 com " + pontuacaoJogador1 + " XP é do nível: " + nivelJogador1);
        System.out.println("O Jogador 2 com " + pontuacaoJogador2 + " XP é do nível: " + nivelJogador2);
        System.out.println("O Jogador 3 com " + pontuacaoJogador3 + " XP é do nível: " + nivelJogador3);

        // Simulando um jogador ganhando XP
        System.out.println("\nO Jogador 1 completou uma missão e ganhou 800 XP!");
        pontuacaoJogador1 += 800; // 500 + 800 = 1300

        // Verificamos o nível DE NOVO!
        nivelJogador1 = obterNivel(pontuacaoJogador1);
        System.out.println("Novo nível do Jogador 1: " + nivelJogador1);
    }
}