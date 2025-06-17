package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;

public class ProductionLineSimulation { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando ProductionLineSimulation ---");
        Random random = new Random();
        int tempoTotalSimulacao = 120; // segundos (simulando 2 minutos)
        int itensProduzidos = 0;

        // Tempos de processamento por estágio (em segundos)
        int tempoEstagio1Min = 5;
        int tempoEstagio1Max = 10;

        int tempoEstagio2Min = 3;
        int tempoEstagio2Max = 7;

        int tempoEstagio3Min = 4;
        int tempoEstagio3Max = 9;

        // Variáveis para controlar o tempo restante em cada estágio para o item atual
        int tempoRestanteEstagio1 = 0;
        int tempoRestanteEstagio2 = 0;
        int tempoRestanteEstagio3 = 0;

        System.out.println("Iniciando simulação de linha de produção por " + tempoTotalSimulacao + " segundos...");

        for (int tempoAtual = 0; tempoAtual < tempoTotalSimulacao; tempoAtual++) {
            System.out.println("\n--- Tempo: " + tempoAtual + "s ---");

            // Estágio 3 - Conclusão do item
            if (tempoRestanteEstagio3 > 0) {
                tempoRestanteEstagio3--;
                System.out.println("Estágio 3: Processando... Tempo restante: " + tempoRestanteEstagio3 + "s");
                if (tempoRestanteEstagio3 == 0) {
                    itensProduzidos++;
                    System.out.println("Estágio 3: Item CONCLUÍDO! Total de itens: " + itensProduzidos);
                }
            }

            // Estágio 2 - Move para o Estágio 3
            if (tempoRestanteEstagio2 > 0) {
                tempoRestanteEstagio2--;
                System.out.println("Estágio 2: Processando... Tempo restante: " + tempoRestanteEstagio2 + "s");
                if (tempoRestanteEstagio2 == 0) {
                    System.out.println("Estágio 2: Item movido para Estágio 3.");
                    // Inicia processamento no estágio 3
                    if (tempoRestanteEstagio3 == 0) { // Se estágio 3 estiver livre
                        tempoRestanteEstagio3 = random.nextInt(tempoEstagio3Max - tempoEstagio3Min + 1) + tempoEstagio3Min;
                    } else {
                        System.out.println("ATENÇÃO: Estágio 3 ocupado! Item esperando do Estágio 2.");
                        tempoRestanteEstagio2 = 1; // Item espera um segundo para tentar novamente
                    }
                }
            }

            // Estágio 1 - Move para o Estágio 2 ou inicia novo item
            if (tempoRestanteEstagio1 > 0) {
                tempoRestanteEstagio1--;
                System.out.println("Estágio 1: Processando... Tempo restante: " + tempoRestanteEstagio1 + "s");
                if (tempoRestanteEstagio1 == 0) {
                    System.out.println("Estágio 1: Item movido para Estágio 2.");
                    // Inicia processamento no estágio 2
                    if (tempoRestanteEstagio2 == 0) { // Se estágio 2 estiver livre
                        tempoRestanteEstagio2 = random.nextInt(tempoEstagio2Max - tempoEstagio2Min + 1) + tempoEstagio2Min;
                    } else {
                        System.out.println("ATENÇÃO: Estágio 2 ocupado! Item esperando do Estágio 1.");
                        tempoRestanteEstagio1 = 1; // Item espera um segundo para tentar novamente
                    }
                }
            }

            // Inicia um novo item no Estágio 1 se estiver livre
            if (tempoRestanteEstagio1 == 0) {
                tempoRestanteEstagio1 = random.nextInt(tempoEstagio1Max - tempoEstagio1Min + 1) + tempoEstagio1Min;
                System.out.println("Estágio 1: Novo item INICIADO. Tempo de processamento: " + tempoRestanteEstagio1 + "s");
            }
        }

        System.out.println("\n--- Fim da Simulação da Linha de Produção ---");
        System.out.println("Tempo total simulado: " + tempoTotalSimulacao + " segundos");
        System.out.println("Total de itens produzidos: " + itensProduzidos);
    }
}