import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        double paisUm, paisDois;

        System.out.println("Digite a população do país A: ");
        paisUm = imput.nextDouble();

        System.out.println("Digite a população do país B: ");
        paisDois = imput.nextDouble();

        System.out.println(" Vamos calcular os anos necessários para que a população A ultrapasse ou iguale a B");
    
        int ano = 0;
        for (double index = paisUm * 0.03; index < paisDois * 0.015; index++) {
            ano++;

            System.out.print(ano + ", ");
        }

        imput.close();
    }
}
