package com.mycompany.exercicio19;

import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Escreva uma frase: ");
        int numVez = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deve ser mostrada? "));

        for (int i = 1; i <= numVez; i++) {
            JOptionPane.showMessageDialog(null, "Frase: " + frase);
        }
    }
}
