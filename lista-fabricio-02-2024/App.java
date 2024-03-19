import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Consumo de Energia");
        System.out.println("---------------------------------");

        System.out.print("Informe a potência do equipamento em Watts: ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Informe o valor do kW/h em reais: ");
        double valorKWh = scanner.nextDouble();

        double consumoKWh = calcularConsumoEnergia(potenciaWatts, horasPorDia);

        double valorPago = calcularValorPago(consumoKWh, valorKWh);

        System.out.println("\nConsumo de energia: " + consumoKWh + " kWh");
        System.out.println("Valor a ser pago: R$" + valorPago);

        scanner.close();
    }

    public static double calcularConsumoEnergia(double potenciaWatts, double horasPorDia) {
        return (potenciaWatts * horasPorDia) / 1000; 
    }

    public static double calcularValorPago(double consumoKWh, double valorKWh) {
        return consumoKWh * valorKWh;
    }
}