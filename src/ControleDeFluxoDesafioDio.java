import java.util.InputMismatchException;
import java.util.Scanner;
public class ControleDeFluxoDesafioDio {
    public static void main(String[] args) {
    
        try{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        }
        catch(InputMismatchException e) {
            System.out.println("Os campos precisam ser numéricos.");
        }
        
    }
}
