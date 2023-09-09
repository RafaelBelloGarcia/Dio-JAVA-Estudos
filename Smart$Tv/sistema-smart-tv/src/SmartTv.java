import java.util.Scanner;

public class SmartTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calcular o saldo atualizado
        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

        // Imprimir o saldo atualizado com uma casa decimal
        System.out.printf("%.1f%n", saldoAtualizado);
    }
}
