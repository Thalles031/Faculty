import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    

    int alturaDoDegrau;
    int alturaEscada;
    int quantidadeDegraus;
     
    Scanner input = new Scanner(System.in);
     
    System.out.print("Digite a altura de cada degrau(em metros): ");
    alturaDoDegrau = input.nextInt();
     
    System.out.print("Digite a altura da escada(em metros): ");
    alturaEscada = input.nextInt();
     
    quantidadeDegraus = alturaEscada / alturaDoDegrau;
     
    System.out.print("A quantidade de degraus é " + quantidadeDegraus);

    
     input.close();
    }
}
