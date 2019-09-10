package Lista;

import java.util.Scanner;

public class Elemento {
    String nome;
    int idade;


    @Override
    public String toString() {
        return " nome=" + nome +" idade=" + idade;
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome");
        nome= tc.next();
        System.out.println("Digite a idade");
        idade= tc.nextInt();
    }
    public void mostrar(){
        System.out.println(nome);
        System.out.println(idade);
    }

}
