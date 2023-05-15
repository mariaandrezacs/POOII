
package Testes;

import javax.swing.JOptionPane;

public class Teste01 {
    public static void main(String[] args) {
        int a, b, divisao, resto;
        String entrada;
        entrada = JOptionPane.showInputDialog("Informe um numero inteiro: ");
        a = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Informe um numero inteiro: ");
        b = Integer.parseInt(entrada);
        divisao = a / b;
        resto = a % b;
        JOptionPane.showMessageDialog(null, "a/b = " + divisao);
        JOptionPane.showMessageDialog(null, "a%b = " + resto);
    }
}
