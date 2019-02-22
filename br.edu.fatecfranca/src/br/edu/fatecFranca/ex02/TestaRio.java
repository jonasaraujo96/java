/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecFranca.ex02;

/**
 *
 * @author jonas
 */
public class TestaRio {

    public static void main(String[] args) {
        Rio rio1 = new Rio("Peixoto", 19f, false);
        System.out.println(rio1.mostra());
        Rio rio2 = new Rio();
        System.out.println(rio2.mostra());
        rio2.sujar();
        System.out.println(rio2.mostra());
    }
}
