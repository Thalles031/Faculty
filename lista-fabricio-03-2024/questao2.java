import java.util.Scanner;
public class App {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Informe a primeira, segunda e terceira nota: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Você foi aprovado com uma nota de " + media + "! :D");
        } else if (media < 7) {
            System.out.println("Você foi reprovado com uma nota de " + media + ". :C");
        }

        input.close();
    } 
}
