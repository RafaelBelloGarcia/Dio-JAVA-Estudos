package SelecaoCandidatos;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoSelecao {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void imprimirSelecionados() {
        
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salaioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário" + salarioPretendido);
            if (salaioBase >= salarioPretendido) {
                System.out.print(" O candidato " + candidato + " foi selecionado ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
