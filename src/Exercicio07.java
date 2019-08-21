import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args) {
        String senha="java8";
        String nome="java8";
        String lsenha;
        String lnome;
        int i=3;


        do {
            i--;

        lnome = JOptionPane.showInputDialog("Digite seu nome: ");
        lsenha = JOptionPane.showInputDialog("Digite sua senha: ");

            if(lnome.equals(nome) && lsenha.equals(senha)){
                JOptionPane.showMessageDialog(null,"Tente outra vez");
                JOptionPane.showMessageDialog(null,"Tentativas restantes"+i);

            }

        }while(!lnome.equals(nome) && lsenha.equals(senha)|| !(i == 0) );
        if(lnome.equals(nome) && lsenha.equals(senha)){
            JOptionPane.showMessageDialog(null,"Acesso permitido");
        }else{
            JOptionPane.showMessageDialog(null,"Tente novamente");
        }
    }
}
