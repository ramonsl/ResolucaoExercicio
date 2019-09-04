package Aula05;

import java.util.Scanner;

public class MetodosVetor {

    public static void mostrarTam(int[] vetor){
            System.out.println("Tamananho do vetor "+vetor.length );
    }
    public static void ler(int[] vetor){
        Scanner tc = new Scanner(System.in);
        for(int i=0;i<vetor.length;i++){
            System.out.println("Digite o valor de ["+i+"]" );
            vetor[i] =tc.nextInt();
        }
    }
    public static void mostrar(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            System.out.println("o valor de ["+i+"] é =" +vetor[i]);

        }
    }

    public static void preencher(int[] vetor, int maximo){
        for(int i=0;i<vetor.length;i++){
            vetor[i]=(int) (Math.random()*maximo);
        }
    }


    public static boolean procurar(int[] vetor, int buscar) {
        for(int i=0;i<vetor.length;i++){
                if(vetor[i]==buscar){
                    return true;
                }
        }
        return false;
    }

    public static int somar(int[] vetor) {
        int soma=0;
        for(int i=0;i<vetor.length;i++) {
                soma+=vetor[i];
        }
        return soma;
    }
}


