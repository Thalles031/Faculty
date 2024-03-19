import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma de Frações");
        System.out.println("----------------");

        System.out.println("Informe a primeira fração:");
        System.out.print("Numerador: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador1 = scanner.nextInt();

        System.out.println("Informe a segunda fração:");
        System.out.print("Numerador: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador2 = scanner.nextInt();

        Fracao fracao1 = new Fracao(numerador1, denominador1);
        Fracao fracao2 = new Fracao(numerador2, denominador2);

        Fracao resultado = fracao1.somar(fracao2);

        System.out.println("Resultado da soma: " + resultado);
    }
}

class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao somar(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}