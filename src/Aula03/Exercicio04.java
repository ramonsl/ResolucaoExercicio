package Aula03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int idade, contribuicao, cont;
        char sexo;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = leitura.nextInt();
        System.out.println("Informe seu sexo: ");
        sexo = leitura.next().charAt(0);
        System.out.println("Informe quantos anos de contribuicao ");
        contribuicao = leitura.nextInt();

        if (sexo == 'm' || sexo == 'M') {
            if (idade >= 65 && contribuicao >= 35) {
                System.out.println("ja pode se aposentar por contruibicao e idade");
            } else if (idade >= 65) {
                System.out.println("ja pode se aposentar por e idade");
            } else if (idade < 65) {
                System.out.println(" nao pode se aposentar");
                cont = idade - 65;
                System.out.println("faltam " + cont);
            }
        } else {
            if (sexo == 'F' || sexo == 'f') {
                if (idade >= 60 && contribuicao >= 30) {
                    System.out.println("ja pode se aposentar por contruibicao e idade");
                } else if (idade >= 60) {
                    System.out.println("ja pode se aposentar por e idade");
                } else if (idade < 60) {
                    System.out.println(" nao pode se aposentar");
                    cont = idade - 60;
                    System.out.println("faltam " + cont);
                }
            }
        }
    }
}