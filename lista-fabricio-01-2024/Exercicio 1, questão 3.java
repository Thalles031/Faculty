import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome");
       nome = input.nextLine();
    


        System.out.println("Saudações " + nome); 
        
       input.close();


    }
}
