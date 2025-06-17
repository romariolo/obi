package revisao;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite uma palavra: ");
                String palavra = sc.nextLine();

                // Inverte a palavra
                String invertida = new StringBuilder(palavra).reverse().toString();

                if (palavra.equalsIgnoreCase(invertida)) {
                    System.out.println("É um palíndromo!");
                } else {
                    System.out.println("Não é um palíndromo.");
                }

                sc.close();
            }
        }

