import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

            Scanner sc = new Scanner(System.in);

            int nota1;


            System.out.print( "Informe uma nota entre 0 e 10: ");
            nota1 = sc.nextInt();

            while(true) {

                if (nota1>= 0 && nota1 <= 10) {
                    System.out.print( "Valor invalido!");
                } else {
                    break;
                }
            }
                  }
    }

