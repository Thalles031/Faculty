import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numUm, numDois, numTres, numQuatro, numCinco, numMaior;
        
        System.out.println("Informe o primeiro número: ");
        numUm = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        numDois = scanner.nextDouble();

        System.out.println("Informe o terceiro número: ");
        numTres = scanner.nextDouble();

        System.out.println("Informe o quarto número: ");
        numQuatro = scanner.nextDouble();

        System.out.println("Informe o quinto número: ");
        numCinco = scanner.nextDouble();

        numMaior = numUm > numDois ? numUm : (numDois > numTres ? numDois : (numTres > numQuatro ? numTres : (numQuatro > numCinco ? numQuatro : numCinco)));

        System.out.print("O maior número é: "+ numMaior);

        scanner.close();
    }
}
