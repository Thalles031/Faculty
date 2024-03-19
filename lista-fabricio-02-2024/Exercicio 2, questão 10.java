import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Quantidade de água recomendada");
        System.out.println("--------------------------------------------");

        System.out.print("Informe o peso da pessoa em quilogramas: ");
        double peso = scanner.nextDouble();

        double quantidadeAguaLitros = calcularQuantidadeAgua(peso);

        System.out.println("\nQuantidade recomendada de água por dia: " + quantidadeAguaLitros + " litros");

        scanner.close();
    }

    public static double calcularQuantidadeAgua(double peso) {
        return peso * 35 / 1000; 
    }
}
