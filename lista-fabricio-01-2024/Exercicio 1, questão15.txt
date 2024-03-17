import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##00.00");
        double a;
        double b;
        double c;
        double delta;
        double bhaskara1;
        double bhaskara2;

        System.out.println("Digite um valor para A: ");
        a = input.nextDouble();

        System.out.println("Digite um valor para B:");
        b = input.nextDouble();

        System.out.println("Digite um valor para C:");
        c = input.nextDouble();

        delta = Math.pow(b,2) - 4*a*c;
        bhaskara1 = ((-b)+ Math.sqrt(delta))/ (2*a);
        bhaskara2 = ((-b)- Math.sqrt(delta))/ (2*a);

        
        

        System.out.println( "Valor de x1 = " + df.format(bhaskara1));
        System.out.println( "Valor de x2 = " + df.format(bhaskara2));


        input.close();

    } 
 } 
