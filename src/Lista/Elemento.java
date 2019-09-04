package Lista;

import java.util.Scanner;

public class Elemento {
    int valor;
    Elemento proximo;

    @Override
    public String toString() {
        return " valor=" + valor ;
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor");
        valor= tc.nextInt();
    }
    public void mostrar(){
        System.out.println(valor);
    }

}
