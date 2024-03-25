import java.util.Scanner;
public class App {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Por favor, insira seu peso (Em KG): ");
        peso = input.nextDouble();

        System.out.println("Por favor, insira sua altura (Em CM): ");
        altura = input.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            System.out.println("Você está abaixo do peso ideal com um IMC de: " + imc);
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Você está em um peso normal com um IMC de: " + imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está em sobrepeso com um IMC de: " + imc);
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Você está obeso com um IMC de: " + imc);
        } else if (imc >= 40) {
            System.out.println("Você está em obesidade mórbida com um IMC de: " + imc);
        }

        System.out.println("\nLembramos que apesar do resultado, você DEVE consultar um especialista para melhor esclarecimento.");

        input.close();
    }
}