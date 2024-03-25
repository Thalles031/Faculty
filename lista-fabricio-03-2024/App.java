import java.util.Scanner;
public class App {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
 
        int estacao;
 
        System.out.println("Escolha uma estação:");
        System.out.println("\n(1) - Inverno \n(2) - Verão \n(3) - Outono \n(4) - Primavera");
         estacao = input.nextInt();
 
         if (estacao == 1) {
             System.out.println("Se não tivéssemos inverno, a primavera não seria tão agradável: se não experimentássemos algumas vezes o sabor da adversidade, a prosperidade não seria tão bem-vinda.");
         } else if (estacao == 2) {
             System.out.println("Que o verão floresça em nossos corações e que as ondas do amor transbordem para dentro das nossas almas. ☀️");
         } else if (estacao == 3) {
             System.out.println("Uma árvore em flor fica despida no outono. A beleza transforma-se em feiura, a juventude em velhice e o erro em virtude. Nada fica sempre igual e nada existe realmente. Portanto, as aparências e o vazio existem simultaneamente.");
         } else if (estacao == 4) {
             System.out.println("Do mesmo modo que no início da primavera todas as folhas têm a mesma cor e quase a mesma forma, nós também, na nossa tenra infância, somos todos semelhantes e, portanto, perfeitamente harmonizados.");
         }
         
         input.close();
     }
 }