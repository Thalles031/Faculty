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

        System.out.print("Informe o valor do kW/h (em reais): ");
        double valorKWh = scanner.nextDouble();

        double consumoDiarioKWh = calcularConsumoEnergia(potenciaWatts, horasPorDia);

        double consumoMensalKWh = consumoDiarioKWh * 30; 

        double valorPagoMensal = consumoMensalKWh * valorKWh;

        System.out.println("\nConsumo de energia por mês: " + consumoMensalKWh + " kWh");
        System.out.println("O valor a ser pago por mês é: R$" + valorPagoMensal);

        scanner.close();
    }

    public static double calcularConsumoEnergia(double potenciaWatts, double horasPorDia) {
        return (potenciaWatts * horasPorDia) / 1000; 
    }
}
