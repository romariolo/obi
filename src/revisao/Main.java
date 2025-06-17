package revisao;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //String é uma cadeia de caracteres
        String saudacao = "Olá, mundo!";
        System.out.println(saudacao);


        String nome = "String";
        int tamanho = nome.length();  // Retorna
        String maiusculo = nome.toUpperCase();  // Retorna "STRING"
        boolean comecaComS = nome.startsWith("S");  // Retorna true

        System.out.println("Tamanho: " + tamanho);
        System.out.println("Maiúsculas: " + maiusculo);
        System.out.println("Começa com S? " + comecaComS);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String meuNome = scanner.nextLine();

        System.out.println("Bem-vindo(a), " + meuNome + "!");


        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println("String 'a' é igual a String 'b'?" + a.equals(b)); // true
        System.out.println("String 'a' é igual a String 'c'? " + a.equals(c)); // true
        System.out.println(a == c);      // false


        String nome1 = "João";
        String nome2 = "joão";

        System.out.println(nome1.equalsIgnoreCase(nome2));

        //Concatenando revisao.Strings
        String nomeConcatenacao = "Ana";
        String saudacaoConcatenacao = "Olá, " + nomeConcatenacao + "!";
        System.out.println(saudacao);


        //Usando concat
        String parte1 = "Bom ";
        String parte2 = "dia";
        String frase = parte1.concat(parte2);

        System.out.println(frase);

        //Métodos úteis

        String texto = " Programação em Java ";

        // Remove espaços do início e fim
        System.out.println(texto.trim());

        // Transforma em maiúsculo
        System.out.println(texto.toUpperCase());

        // Transforma em minúsculo
        System.out.println(texto.toLowerCase());

        // Tamanho da String
        System.out.println("Tamanho: " + texto.length());

        // Substring
        System.out.println(texto.substring(0, 5)); // " Pro"

        // Verifica se contém outra string
        System.out.println(texto.contains("Java")); // true

        // Substituir palavra
        System.out.println(texto.replace("Java", "Python"));

    }

}
