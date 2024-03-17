import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String nome;
        System.out.println("Informe seu nome"); 
        nome = input.nextLine();

        String endereco;
        System.out.println("informe seu endereco");
        endereco = input.nextLine();
        
        int numero;
        System.out.println("informe seu telefone");
        numero = input.nextInt();
    

        System.out.println(" seu nome é:" + nome);
        System.out.println("Seu endereço é:" + endereco);
        System.out.println("Seu telefone é:" + numero);

       input.close();
 


    }
}
