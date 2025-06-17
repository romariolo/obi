import java.util.Scanner;

public class AulaStrings {
    public static void main(String[] args) {


        //Palídromo

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        // Limpar espaços e transformar para minúsculo
        String limpa = entrada.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Inverter a string
        String invertida = new StringBuilder(limpa).reverse().toString();

        if (limpa.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }



        //Contando tipos de caracteres em uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int letras = 0;
        int digitos = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLetter(c)) {       // 🅰️ Verifica se é letra
                letras++;
            } else if (Character.isDigit(c)) { // 🔢 Verifica se é número
                digitos++;
            } else if (Character.isWhitespace(c)) { // ⬜ Verifica se é espaço
                espacos++;
            } else {                           // ❗ Qualquer outro caractere
                outros++;
            }
        }

        System.out.println("Letras: " + letras);     // 🅰️
        System.out.println("Dígitos: " + digitos);   // 🔢
        System.out.println("Espaços: " + espacos);   // ⬜
        System.out.println("Outros: " + outros);     // ❗

    }


    }

