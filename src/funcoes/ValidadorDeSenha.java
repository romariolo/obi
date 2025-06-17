package funcoes;

public class ValidadorDeSenha {

    // --- Funções Ajudantes (private) ---

    private static boolean temTamanhoMinimo(String senha) {
        return senha.length() >= 8;
    }

    private static boolean contemNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contemLetraMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // --- Função Principal (public) ---
    public static boolean isSenhaValida(String senha) {
        System.out.println("Verificando a senha: '" + senha + "'");
        return temTamanhoMinimo(senha) && contemNumero(senha) && contemLetraMaiuscula(senha);
    }

    public static void main(String[] args) {
        String senha1 = "senhafraca";
        String senha2 = "Senhaforte123";
        String senha3 = "Senhasemnumero";
        String senha4 = "Senha1";

        System.out.println("Resultado: " + (isSenhaValida(senha1) ? "Válida ✅" : "Inválida ❌"));
        System.out.println("---");
        System.out.println("Resultado: " + (isSenhaValida(senha2) ? "Válida ✅" : "Inválida ❌"));
        System.out.println("---");
        System.out.println("Resultado: " + (isSenhaValida(senha3) ? "Válida ✅" : "Inválida ❌"));
        System.out.println("---");
        System.out.println("Resultado: " + (isSenhaValida(senha4) ? "Válida ✅" : "Inválida ❌"));
    }
}