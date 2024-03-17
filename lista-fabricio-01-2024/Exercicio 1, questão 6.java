import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
         double idade, ano, dias;

         ano = 365;

         System.out.println("Digite a sua idade: ");
         idade = input.nextDouble();

          dias = idade*ano;

          System.out.println(" A quantidade de dias que você viveu é: " +dias+"\n");


          input.close();

         







    }
}
