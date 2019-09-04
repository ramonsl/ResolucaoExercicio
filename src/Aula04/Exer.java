package Aula04;

public class Exer {


    public static void main(String[] args) {
        int[] vetor= new int[10];
        int[] vetor2 = {3,3,3,3,3,3};
        String[][] matriz = new String[3][3];
        String[] cafes={"Suave","Forte","Descafeinado"};

        for(String cafe: cafes){
            System.out.println(cafe);
        }

        for (int l=0;l<matriz.length;l++){
            for(int c=0;c< matriz[0].length;c++){
                System.out.println(matriz[l][c]);
            }
        }

    }
}
