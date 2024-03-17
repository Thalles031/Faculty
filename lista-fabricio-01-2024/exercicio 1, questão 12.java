import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double valor, valorSub, valorSoma;


        System.out.println("Digite o valor desejado: ");
        valor = input.nextDouble();


        valorSub = valor - 1;
        valorSoma = valor + 1;
        

        System.out.println( "O valor sucessor desejado é: " + valorSoma + " e o valor antecessor desejado é: " + valorSub );


        input.close();

    } 

}
