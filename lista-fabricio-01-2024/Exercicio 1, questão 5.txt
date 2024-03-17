import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
         double cotDolar, valDolar, valReal;

         cotDolar = 4.95;

         System.out.println("Digite o valor em dólares: ");
         valDolar = input.nextDouble();


         valReal = valDolar*cotDolar;

         System.out.println( "o valor em reais é: " +valReal+ "\n");


         input.close();


         



        
    }
    }
