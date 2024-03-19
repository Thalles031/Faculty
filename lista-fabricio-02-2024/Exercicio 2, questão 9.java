import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("------------------");

        System.out.print("Informe o peso atual em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura em centímetros: ");
        double altura = scanner.nextDouble();

        altura /= 100;

        double imc = calcularIMC(peso, altura);

        double pesoIdeal = calcularPesoIdeal(altura);
        double pesoIdealAjustado = calcularPesoIdealAjustado(imc, pesoIdeal);

        // Exibir resultados
        System.out.println("\nSeu IMC é: " + imc);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
        System.out.println("Peso ideal ajustado: " + pesoIdealAjustado + " kg");

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(double altura) {
        return 22 * (altura * altura);
    }

    public static double calcularPesoIdealAjustado(double imc, double pesoIdeal) {
        return pesoIdeal * (imc / 22);
    }
}
