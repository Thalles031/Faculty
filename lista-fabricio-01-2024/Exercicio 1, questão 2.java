import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float n1, n2;
        System.out.println("Informe seu numero");
       n1 = input.nextInt();

       System.out.println("Informe o segundo numero");
       n2 = input.nextInt();

       System.out.println("O resultado da divisão entre os numeros é:"  + n1 / n2 );
        
       input.close();


    }
}
