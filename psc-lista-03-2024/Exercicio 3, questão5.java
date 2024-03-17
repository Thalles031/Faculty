
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1 = 0;
        float n2 = 0;

        String operador = " ";

        System.out.println("Informe dois números reais: ");
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        input.nextLine();

        System.out.println("Informe um operador : \n");
        System.out.println("Soma: +");
        System.out.println("Subtracao: -");
        System.out.println("Multiplicacao: *");
        System.out.println("Divisao: /");
        System.out.println("Potencia: ^");
        operador = input.nextLine();

        switch (operador) {
            case "+":
                System.out.printf("\nO resultado da soma entre os numeros é: %.2f", n1 + n2);
                break;

            case "-":
                System.out.printf("\nO resultado da subtracao entre os numeros é: %.2f", n1 - n2);
                break;
            case "*":
                System.out.printf("\nO resultado da multiplicacao entre os numeros é: %.2f", n1 * n2);
                break;

            case "/":
                System.out.printf("\nO resultado da divisao entre os numeros é: %.2f", n1 / n2);
                break;

            case "^":
                System.out.printf("\nO resultado da operacao entre os numeros é: %.2f", Math.pow(n1, n2));
                break;
        
            default:
                System.out.println("O simbolo para a operacao é invalido.");
                break;
        }

        input.close();
    }

}
