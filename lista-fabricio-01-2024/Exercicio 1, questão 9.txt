import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
         double areaDoCirculo, raio, PI;

         PI = 3.14;
        
         System.out.println("Digite o valor de raio em centímetros: ");
          raio = input.nextDouble();

          areaDoCirculo = PI* (raio*raio);
          

         System.out.println(" O raio do circulo de " + raio + " cm, tem a area equivalente de: " + areaDoCirculo + " cm^2 " );

          input.close(); 

    }
    }
