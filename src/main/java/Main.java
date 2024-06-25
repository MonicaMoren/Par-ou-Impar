import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    System.out.println("####################################");
    System.out.println("Participe da Nossa Roleta de Premios !!!");
    System.out.println(" ");
    System.out.println("Se o programa der Errado... Você Ganha!! se der Certo, Eu ganho");
  System.out.println(" ");
    System.out.println("O programa ira classificar seu número escolhido é par ou impar");
    System.out.println(" ");
            System.out.print("Digite um número: ");
    
            int numero = sc.nextInt();
    System.out.printf("Numero  = %d", numero);

    if (numero %  2 == 0) {
      System.out.println(" é Par.");
    } else if (numero % 1 == 0) {
      System.out.println(" é Impar.");
    }
System.out.println(" ");
    System.out.println("####################################");
            sc.close();



  }
}