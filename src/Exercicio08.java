import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        num1 = scan.nextInt();
        for(int i= 1; i <= 10; i++ ) {
            System.out.println(num1 * i);
        }

    }

}
