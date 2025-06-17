package contagemSimulacao; // Pacote opcional, remova se não estiver usando.

import java.util.Random;

public class QueueSimulation { // Deve ser public para ser acessível externamente se pacote for usado
    public static void main(String[] args) {
        System.out.println("\n\n\n--- Executando QueueSimulation ---");
        Random random = new Random();
        int tempoTotalSimulacao = 60; // segundos (simulando 1 minuto de operação)
        int tempoAtual = 0;
        int clientesAtendidos = 0;
        int clientesNaFila = 0; // Quantos clientes estão esperando

        // Parâmetros de simulação (podem ser aleatórios em simulações mais complexas)
        int intervaloChegadaCliente = 5; // Um cliente chega a cada 5 segundos
        int tempoAtendimentoMin = 2; // Atendimento mínimo de 2 segundos
        int tempoAtendimentoMax = 8; // Atendimento máximo de 8 segundos

        System.out.println("Iniciando simulação de fila de atendimento por " + tempoTotalSimulacao + " segundos...");

        while (tempoAtual < tempoTotalSimulacao) {
            // Cliente chega
            if (tempoAtual % intervaloChegadaCliente == 0) { // A cada 'intervaloChegadaCliente' segundos
                clientesNaFila++;
                System.out.println("Tempo " + tempoAtual + "s: Cliente chegou. Fila: " + clientesNaFila);
            }

            // Atendimento
            if (clientesNaFila > 0) {
                int tempoParaAtendimento = random.nextInt(tempoAtendimentoMax - tempoAtendimentoMin + 1) + tempoAtendimentoMin;
                clientesNaFila--;
                clientesAtendidos++;
                System.out.println("Tempo " + tempoAtual + "s: Cliente atendido. Fila: " + clientesNaFila + ". Atendidos: " + clientesAtendidos);
            }

            tempoAtual++; // Avança 1 segundo na simulação
        }

        System.out.println("\n--- Fim da Simulação ---");
        System.out.println("Tempo total simulado: " + tempoTotalSimulacao + " segundos");
        System.out.println("Total de clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes restantes na fila: " + clientesNaFila);
    }
}