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
    double precoTotalCeramica = 0;
    double valorDaCeramica = 0;


    System.out.println("Informe a largura da Area: ");
    larguraDaArea = input.nextDouble();

    System.out.println("Informe o comprimento da Area: ");
    comprimentoDaArea = input.nextDouble();

    System.out.println("Informe a largura da Ceramica: ");
    larguraDaCeramica = input.nextDouble();

    System.out.println("Informe o comprimento da Ceramica: ");
    comprimentoDaCeramica = input.nextDouble();

    System.out.println("Informe o valor do metro quadrado da Ceramica: ");
    valorDaCeramica = input.nextDouble();

    area = larguraDaArea * comprimentoDaArea;
    areaDaCeramica = larguraDaCeramica * comprimentoDaCeramica;

    quantidadePecas = area/areaDaCeramica;

    quantidadeTotal = quantidadePecas + (quantidadeTotal * 0.1);

    precoTotalCeramica = (valorDaCeramica * areaDaCeramica) * quantidadeTotal;

    System.out.printf("A quantidade de peças para a obra é: %.0f\n", quantidadeTotal);
    System.out.printf("O preco total para comprar as peças é: %.2f", precoTotalCeramica);

    input.close();


    }
}

