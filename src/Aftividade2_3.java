import javax.swing.*;

public class Aftividade2_3 {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        String ler;

        ler = JOptionPane.showInputDialog("Digite a nota 1: ");
        n1 = Double.parseDouble(ler);
        ler = JOptionPane.showInputDialog("Digite a nota 2: ");
        n2 = Double.parseDouble(ler);
        ler = JOptionPane.showInputDialog("Digite a nota 3: ");
        n3 = Double.parseDouble(ler);

        media = (n1 + n2 + n3)/3;

        if (media>=6){
            JOptionPane.showMessageDialog(null,"Aluno aprovado! Media: "+media);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno reprovado! Media: "+media);
        }
    }
}

