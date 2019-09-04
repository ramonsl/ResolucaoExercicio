package Aula05;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        MetodosVetor.mostrarTam(vetor);
        //MetodosVetor.ler(vetor);
        MetodosVetor.preencher(vetor,60);
        MetodosVetor.mostrar(vetor);
        if(MetodosVetor.procurar(vetor,6)){
            System.out.println("Valor 6 encontrado");
        }
        System.out.println(MetodosVetor.somar(vetor));
    }
}
