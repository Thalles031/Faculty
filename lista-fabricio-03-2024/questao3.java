import java.util.Scanner;
public class App {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos, semVotar, totalVotos;
        float pctNulos, pctValidos, pctBrancos;

        System.out.println("Informe a quantidade de votos brancos: ");
        votosBrancos = input.nextInt();

        System.out.println("Informe a quantidade de votos nulos: ");
        votosNulos = input.nextInt();

        System.out.println("Informe a quantidade de votos válidos: ");
        votosValidos = input.nextInt();

        System.out.println("Informe a quantidade de eleitores: ");
        totalEleitores = input.nextInt();

        totalVotos = votosBrancos + votosNulos + votosValidos;

        pctNulos = ((float)votosNulos / totalVotos) * 100;
        pctBrancos = ((float)votosBrancos / totalVotos) * 100;
        pctValidos = ((float)votosValidos / totalVotos) * 100;

        semVotar = totalEleitores - (votosBrancos + votosNulos + votosValidos);

        if(semVotar == 0) {
            System.out.println("Obtivemos uma votação onde: ");
            System.out.println("\nVotos brancos representam: " + pctBrancos + "% do total de votos!");
            System.out.println("\nVotos nulos representam: " + pctNulos + "% do total de votos!");
            System.out.println("\nVotos válidos representam: " + pctValidos + "% do total de votos!");
        } else if(semVotar != 0) {
            System.out.println("Obtivemos uma votação onde: ");
            System.out.println("\nVotos brancos representam: " + pctBrancos + "% do total de votos!");
            System.out.println("\nVotos nulos representam: " + pctNulos + "% do total de votos!");
            System.out.println("\nVotos válidos representam: " + pctValidos + "% do total de votos!");
            System.out.println("\nE " + semVotar + " dos eleitores não votaram!");
        }

        input.close();
    }
}
