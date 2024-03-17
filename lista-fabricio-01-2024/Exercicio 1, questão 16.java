import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double combustivelConsumido;
        double kmPorLitro;
        double kmPercorrido;

        System.out.println("Digite quantos kilômetros foram percorridos: ");
        kmPercorrido = input.nextDouble();

        System.out.println("Digite a quantidade de combustível consumida:");
        combustivelConsumido = input.nextDouble();

        kmPorLitro = kmPercorrido/combustivelConsumido;
        
        System.out.println("O consumo médio foi de " + (kmPorLitro) + " Kilomêtros por litro ");


        input.close();

    } 
 } 
