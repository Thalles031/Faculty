import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
         double salario, reajuste, adicional;
         
          adicional = 0.07;
         
         System.out.println("Digite a seu salário: ");
          salario = input.nextDouble();

          reajuste = salario*adicional;
          salario = reajuste + salario;

         System.out.println(" Seu salário é: " +salario+"\n");

          input.close(); 

    }
    }
