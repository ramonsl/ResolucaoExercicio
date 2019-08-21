import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        float resistencia[] = new float[4];
        float resEquivalente=0, maiorResistencia=0, menorResistencia=1000000;

        JOptionPane.showMessageDialog(null,"Digite as resistencias");
        for (int x=0; x<4; x++){
            resistencia[x] = Float.parseFloat(JOptionPane.showInputDialog("Resistencia"+x));
            if (resistencia[x] > maiorResistencia){
                maiorResistencia = resistencia[x];
            }
            if (resistencia[x] < menorResistencia){
                menorResistencia = resistencia[x];
            }
            resEquivalente += resistencia[x];
        }
        JOptionPane.showMessageDialog(null,"Resistencia equivalente: " +resEquivalente);
        JOptionPane.showMessageDialog(null,"Maior resistencia: " +maiorResistencia);
        JOptionPane.showMessageDialog(null,"Menor resistencia: " +menorResistencia);
    }
}
