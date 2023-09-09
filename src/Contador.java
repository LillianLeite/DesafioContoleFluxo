import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador<numero1> {
    public static void main(String[] args) {
        try{
            try{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        if (numero1 > numero2){
            throw new Exception("O segundo número deve ser maior que o primeiro");
        }
                }

        catch(InputMismatchException e){
            System.out.println("Os campos precisam ser numéricos");
        }
        }
      catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    static void contar(int numero1, int numero2) {

        int contagem = numero2 - numero1;

        for(int acumular = contagem; acumular >= 1; acumular ++){
            System.out.println("Houveram" + acumular + "iterações");
        }
    }
}
