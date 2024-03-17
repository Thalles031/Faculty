import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
         double metros, centimetros, medida;

         centimetros = 100;
         
         
         System.out.println("Digite a metragem desejada: ");
          metros = input.nextDouble();

          medida = metros*centimetros;
          

         System.out.println(" A medida em centímetros é: " +medida+"\n");

          input.close(); 

    }
    }
