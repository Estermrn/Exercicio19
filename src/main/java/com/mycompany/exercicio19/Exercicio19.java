package com.mycompany.exercicio19;

import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {
        
        String frase;
        int quantidade;
        
        frase = JOptionPane.showInputDialog(null, "Escreva uma frase: ");
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva um número: "));
    
        for ( int i = 0; i < quantidade; i++ ){
           JOptionPane.showMessageDialog(null,"Frase: " + frase);

        }
    }
}
