import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double valorDaHora, numeroDeHoras, salarioBruto, desconto, salarioLiquido;


        System.out.println("Digite o valor das suas horas trabalhadas: ");
        valorDaHora = input.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês:");
        numeroDeHoras = input.nextDouble();
        
        System.out.println("Digite o percentual de desconto do seu INSS:");
        desconto = input.nextDouble();
        
        salarioBruto = valorDaHora*numeroDeHoras;
        desconto =(desconto/100)*salarioBruto;
        salarioLiquido = salarioBruto - desconto;
        

        System.out.println( "O sálario liquido é equivalente a: " + salarioLiquido );


        input.close();

    } 

}
