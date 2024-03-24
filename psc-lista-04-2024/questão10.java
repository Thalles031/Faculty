import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        
    Scanner imput = new Scanner(System.in);
    int num1;
    int num2;
        
        
    System.out.println(" Escreva um número:");
    num1 = imput.nextInt();
    System.out.println(" Escreva mais um número:");
    num2 = imput.nextInt();
        
    int menorNumero = 0;


    if (num1 < num2){

    menorNumero = num1;

    }else {

    menorNumero = num2;

    }
    int diferenca = Math.abs(num1 - num2);


    for (int i = 1; i < diferenca; i++)

    System.out.print(menorNumero + i + " ");
  
    imput.close();;
		
         
    }
    }
