package Aula03;

import javax.swing.*;

public class Exercicio07 {
/*
    Faça uma classe que solicite login
    e senha, simulando o acesso a um
     sistema. Considere que os conteúdos '
     de login e senha originais são iguais a
      “java8”. O usuário deverá fornecer
      login e senha e você irá compará-los
       com os conteúdos originais.
       O usuário tem três chances para
        digitar corretamente os dados
        de login e senha. Para cada tentativa
        incorreta deve aparecer uma mensagem
        alertando o erro e apresentando a
        quantidade de tentativas que ainda restam.
*/
public static void main(String[] args) {
    String senha="java8";
    String login="java8";
    String infoSenha;
    String infoLogin;
    int cont=0;

    do{
        infoLogin= JOptionPane.showInputDialog("Usuario?");
        infoSenha= JOptionPane.showInputDialog("Senha?");
        cont++;
    }while (!(infoLogin.equals(login)&& infoSenha.equals(senha)) &&(cont!=3));
    if(cont <3){
        System.out.println("Acesso realizado");
    }else{
        System.out.println("Acesso negado senha bloqueada");
    }
}
}
