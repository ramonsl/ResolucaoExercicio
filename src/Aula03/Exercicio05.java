package Aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String produto;
        double valor, desconto, ValorDesconto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome do produto: ");
        produto = teclado.next();


            do {
                System.out.println("Digite o valor: ");
                valor = teclado.nextDouble();
                if (valor <= 0) {
                    System.out.println("Valor invalido");
                }
            } while (valor <= 0);

        if(valor >=50 && valor<200){
            desconto=valor*0.05;
            System.out.println(produto);
            System.out.println("Valor:"+valor);
            System.out.println("Valor com desconto:"+(valor - desconto));
        }

        else if(valor >=200 && valor<500){
            desconto=valor*0.06;
            System.out.println(produto);
            System.out.println("Valor:"+valor);
            System.out.println("Valor com desconto:"+(valor - desconto));
        }

        else if(valor >=500 && valor<1000){
            desconto=valor*0.07;
            System.out.println(produto);
            System.out.println("Valor:"+valor);
            System.out.println("Valor com desconto:"+(valor - desconto));
        }

        else if(valor >=1000){
            desconto=valor*0.08;
            System.out.println(produto);
            System.out.println("Valor:"+valor);
            System.out.println("Valor com desconto:"+(valor - desconto));
        }

    }

}
