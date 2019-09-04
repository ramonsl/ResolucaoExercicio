package Aula04;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
       // String[] frase = new String[10];//AQUI Voce ta criando um ARRAY de String
       String frase;
        int i,j;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        frase=leitura.next();
        //até aqui tudo igual...leitura e tal
        //aqui esta o segredo, existe um outro tipo de String
        //"mais" porreta com mais métodos
        //o Stringbuilder
        StringBuilder fraseinversa= new StringBuilder(frase);//aqui criei um string buider com a string

        fraseinversa=fraseinversa.reverse();//e ele é tão porreta que tem um método que faz isso de forma automatica.

        if(frase.equals(fraseinversa.toString())){ //compara..e já foi
            System.out.println("é");
        }else{
            System.out.println("não é");
        }





    }
}