/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Calculadora3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el num 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el num 2: "));
        
        Operaciones op=new Operaciones();
        int suma=op.sumar(n1, n2);
        int resta=op.restar(n1, n2);
        int multiplicacion=op.multiplicar(n1, n2);
        int division=op.dividir(n1, n2);
        op.mostrarResultados(suma, resta, multiplicacion, division);
    }
    
}
