/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex01;

/**
 *
 * @author jonas
 */
public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Primeiro Produto", 20, 250f);
        System.out.println(produto1.mostra());
        
        Produto produto2 = new Produto();
        System.out.println(produto2.mostra());
    }
}

