import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Distância Entre Dois Pontos no Plano Cartesiano");
        System.out.println("----------------------------------------------------------");

        System.out.println("Informe as coordenadas do primeiro ponto, denominado P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nInforme as coordenadas do segundo ponto, denominado P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.println("\nA distância entre os pontos P1 e P2 é: " + distancia);

        scanner.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
