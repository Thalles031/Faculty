import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;


        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();


        System.out.println("Digite a segunda nota:");
        nota2 = input.nextDouble();
        

        System.out.println("Digite a terceira nota:");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println( "A média das notas fornecidas é: " + media );


        input.close();

    } 

}
