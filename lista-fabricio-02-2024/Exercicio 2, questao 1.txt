import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int horas, minutos;

        System.out.println("Informe quantas horas são:");
        Scanner input = new Scanner (System.in);
        horas = input.nextInt();

        minutos = horas*60;

        System.out.println(" Se passaram exatamente " + minutos + " Minutos ");

    }
}
