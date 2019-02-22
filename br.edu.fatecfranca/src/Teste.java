/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author jonas
 */
public class Teste {
    
    public static void main(String[] args) {
    Carro obj1 = new Carro();
    obj1.ligar();
    obj1.acelerar(10);
    System.out.println(obj1.toString());
    JOptionPane.showMessageDialog(null, obj1.toString());
    }
}
