package Aula08;

import java.util.Scanner;

public class Teclado {
    Scanner tc = new Scanner(System.in);

    public int lerInt(){
        System.out.println("Digite um inteiro");
        return tc.nextInt();
    }
    public int lerInt(String msg){
        System.out.println(msg);
        return tc.nextInt();
    }
}
