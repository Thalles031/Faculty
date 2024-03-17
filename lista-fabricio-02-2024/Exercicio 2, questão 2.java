import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        double etanol, gasolina, media;

        System.out.println("Informe o preco do etanol:");
        etanol = input.nextDouble();

        System.out.println("Informe o preco da gasolina:");
        gasolina = input.nextDouble();

        media = (etanol*100)/gasolina;
        if(media>70){
            System.out.println("Nao vale a pena abastecer com Etanol");

        } else{
            System.out.println("Vale a pena abastecer com Etanol");
        }
        


    }
}
