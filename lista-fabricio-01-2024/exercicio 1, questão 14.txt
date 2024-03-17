import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double valorA, valorB, primeiroResultado, segundoResultado;


        System.out.println("Digite o valor A: ");
        valorA = input.nextDouble();

        System.out.println("Digite o valor B:");
        valorB = input.nextDouble();
        
        primeiroResultado = valorB;
        segundoResultado = valorA;
        

        System.out.println( " O valor de A passou a ser: " + primeiroResultado + " E o valor de B passou a ser: " + segundoResultado );
        


        input.close();

    } 
 } 
