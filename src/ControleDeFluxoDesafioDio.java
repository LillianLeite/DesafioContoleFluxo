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
        scanner.close();
        }
        
    }

    static void contar(int numero1, int numero2) throws NumerosInvalidosExeption{
        int contagem;

        if (numero1 < numero2)
            int contagem = numero2 - numero1;
        else
            System.out.println("O segundo número deve ser maior que o primeiro");
        

        for(conta = contagem; conta >= 1; conta --);
        System.out.println("Houveram interações" + conta);

    }
}
