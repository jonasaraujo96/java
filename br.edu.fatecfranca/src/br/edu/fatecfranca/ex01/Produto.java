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
public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    
    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public Produto() {
        this.id = 5;
        this.descricao = "Segundo Produto";
        this.qtde = 200;
        this.preco = 200f;
    }
    
    public void comprar(int x) {
        this.qtde += x;
    }
    
    public void vender(int x) {
        this.qtde += x;
    }
    
    public void subir(float x) {
        this.preco += x;
    }
    
    public void descer(float x) {
        this.preco -= x;
    }
    
    public String mostra() {
        return "ID: " + this.id + " Descrição: " + this.descricao + " Quantidade: " + this.qtde + " Preço: " + this.preco;
    }
}
