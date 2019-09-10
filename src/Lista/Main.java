package Lista;

import com.sun.javafx.tk.quantum.QuantumToolkit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tam=10;
        int qtd=0;
        int op;
        Elemento[] lista= new Elemento[tam];


        Scanner tc = new Scanner(System.in);


        do{
            System.out.println("1 para add no fim");
            System.out.println("4 para add no inicio");
            System.out.println("2 para rem no fim");
            System.out.println("5 para rem no inicio");
            System.out.println("3 para listar ");
            System.out.println("99 para sair ");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    Elemento e= new Elemento();
                    e.ler();
                    lista[qtd]=e;
                    qtd++;
                    break;
                }
                case 2:{
                    lista[qtd-1]=null;
                    qtd--;
                }

                case 3:{
                    for (int i=0;i<qtd;i++){
                        System.out.println(lista[i]);
                    }
                    break;
                }

                case 4: {
                    Elemento e = new Elemento();
                    e.ler();
                    if (qtd == 0) {
                        lista[qtd] = e;
                        qtd++;
                    } else {
                        for (int i = qtd; i >= 0; i--) {
                            lista[i + 1] = lista[i];
                        }
                        lista[0] = e;
                        qtd++;
                    }

                }
                case 5:{
                    for(int i=0;i<qtd;i++){
                        lista[i]=lista[i+1];
                    }
                    lista[qtd]=null;
                    qtd--;
                    break;
                }




            }

        }while (op!=99);


        System.out.println("quantidade na lista ="+qtd);

    }
}
