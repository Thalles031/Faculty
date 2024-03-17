import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        

    double n1 = 0;
    double n2 = 0;
    double n3 = 0;;
    double media;
    
    System.out.println("Informe o primeiro numero: ");
    n1 = input.nextDouble();

    System.out.println("Informe o segundo número: ");
    n2 = input.nextDouble();

    System.out.println("Informe o terceiro númro: ");
    n3 = input.nextDouble();


    if(n1>n2 && n2>n3){

    System.out.println("O maior número digitado foi: " + n1);
    
    }

    if(n2>n1 && n2>n3){

    System.out.println("O maior número digitado foi: " + n2);
    
    }
    
    if(n3>n2 && n3>n1){

    System.out.println("O maior número informado foi: " + n3);
    
    }

    if(n1<n2 && n1<n3){

    System.out.println("O menor número informado foi: " + n1);
    

    }

    if(n2<n1 && n2<n3){

    System.out.println("O Menor número informado foi: " + n2)    ;        
    
    }
     
    if(n3<n1 && n3<n2){

    System.out.println("O Menor número informado foi: " + n3)    ;        

    }
    
    media = n1+n2+n3/3;

    System.out.println("A média dos três números informados é: " + media);
    media = input.nextDouble();

    input.close();

    }

}
