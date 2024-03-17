import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double fahrenheit, temperaturaEmCelsius;


        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();

        temperaturaEmCelsius = fahrenheit - 32;
        temperaturaEmCelsius = temperaturaEmCelsius/1.8;

        System.out.println( "A temperatura em graus celsius é: " + temperaturaEmCelsius );


        input.close();

    } 

}
