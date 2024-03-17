import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Double larguraDaArea = 0.0;
    Double comprimentoDaArea = 0.0;
    Double larguraDaCeramica = 0.0;
    Double comprimentoDaCeramica = 0.0;
    double area = 0;
    double areaDaCeramica = 0;
    double quantidadePecas = 0;
    double quantidadeTotal = 0;

    System.out.println("Informe a largura da Area: ");
    larguraDaArea = input.nextDouble();

    System.out.println("Informe o comprimento da Area: ");
    comprimentoDaArea = input.nextDouble();

    System.out.println("Informe a largura da Ceramica: ");
    larguraDaCeramica = input.nextDouble();

    System.out.println("Informe o comprimento da Ceramica: ");
    comprimentoDaCeramica = input.nextDouble();

    area = larguraDaArea * comprimentoDaArea;
    areaDaCeramica = larguraDaCeramica * comprimentoDaCeramica;

    quantidadePecas = area/areaDaCeramica;

    quantidadeTotal = quantidadePecas + (quantidadeTotal * 0.1);

    System.out.printf("A quantidade de peças para a obra é: %.0f", quantidadeTotal);
        
    
    input.close();
    }
    
}
