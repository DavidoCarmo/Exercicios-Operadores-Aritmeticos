import java.util.Scanner;
 
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("\nOlá, meu nome é ");
        String nome = scanner.nextLine();
   
        System.out.print("\nInforme o seu sobrenome ");
        String sobrenome = scanner.nextLine();
           
        System.out.printf("Nome Completo: %s %s", nome, sobrenome );
   
        scanner.close();
        }
    }
