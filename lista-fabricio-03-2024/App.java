import java.util.Scanner;
public class App {
        public static void main(String[]args) {
            
            Scanner input = new Scanner(System.in);
    
            double primeiroNumero, segundoNumero, divisao;
    
            System.out.print("Informe o primeiro número para divisão: ");
            primeiroNumero = input.nextDouble();
    
            System.out.print("Informe o segundo número para divisão: ");
            segundoNumero = input.nextDouble();
    
            divisao = primeiroNumero / segundoNumero;
    
            System.out.print("O resultado da divisão é: " + divisao);
    
            input.close();
        }
    }