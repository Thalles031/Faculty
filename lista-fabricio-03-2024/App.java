import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           String nome;
           int quantidade;
           Double preco;
           Double total;
           double totalpagar;
           double desconto;
           
           
           
          
          
          
          System.out.print("Insira o nome do produto: " );
          nome = input.nextLine();
          
          
          System.out.print("Insira a quantidade de produto adquirida : " );
          quantidade = input.nextInt();
          
          
          System.out.print("Insira o preço por unidade: " );
          preco = input.nextDouble();
          
          
          total = quantidade * preco;
          
          
          System.out.print("O total é: " + total );
          
          
          
          if (quantidade <= 5){
              
              desconto = 2 ;
           totalpagar = total - ((desconto *100) /total);
           
           
           System.out.print("\n O desconto é de: " + desconto + "%" );
           
           System.out.print("\n O total a pagar é: "+ totalpagar );
           
           
          } else if(quantidade > 5 && quantidade <= 10) {
              
              desconto = 3 ;
           totalpagar = total - ((desconto *100) /total);
           
           System.out.print("\n O desconto é de: " + desconto + "%" );
           
           System.out.print("\n O total a pagar é:" + totalpagar); 
           
           
           
            } else if(quantidade > 10 && quantidade < 30) {
              
              desconto = 5 ;
           totalpagar = total - ((desconto *100) /total);
           
           System.out.print("\n O desconto é de: " + desconto + "%" );
           
           System.out.print("\n O total a pagar é:" + totalpagar); 
           
           
           
              } else if(quantidade >=30) {
              
              desconto = 10 ;
           totalpagar = total - ((desconto *100) /total);
           
           System.out.print("\n O desconto é de: " + desconto + "%" );
           
           System.out.print("\n O total a pagar é:" + totalpagar); 
           
              input.close();
      }
      
  }
  }