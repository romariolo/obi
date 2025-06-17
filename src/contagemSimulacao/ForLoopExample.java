package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando ForLoopExample ---");
        System.out.println("Contando de 1 a 5 com for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        System.out.println("\nSimulando 3 lançamentos de dados (apenas repetição):");
        for (int i = 0; i < 3; i++) {
            System.out.println("Lançamento " + (i + 1) + " do dado.");
        }
    }
}