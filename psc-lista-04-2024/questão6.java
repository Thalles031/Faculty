import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= 20; index++) {
            System.out.println(index);
        }

        for (int index = 1; index <= 20; index++) {
            System.out.print(index + ", ");
        }
        
        scanner.close();
    }
}
