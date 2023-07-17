

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        
        int valor = scanner.nextInt();
        
        System.out.println("O valor digitado foi: "  + valor);
        
        scanner.close();
    }
}
