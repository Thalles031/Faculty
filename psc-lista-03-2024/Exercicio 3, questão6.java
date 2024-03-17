import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int n1 = 0;
        int n2 = 0;

        System.out.println("Informe dois números inteiros para o sorteio: ");
        n1 = input.nextInt();
        n2 = input.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int valorGerado = aleatorio.nextInt(min,max);

        if (valorGerado % 2 == 0)
            System.out.printf("\nO número gerado foi %d, um numero par.", valorGerado);
        else
            System.out.printf("\nO número gerado foi %d, um numero ímpar.", valorGerado);

        input. close();
    }

}
