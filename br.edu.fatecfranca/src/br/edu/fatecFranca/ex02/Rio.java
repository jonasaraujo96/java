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
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public Rio() {
        this.nome = "Ribeirão";
        this.nivel = 12f;
        this.poluido = false;
    }
    
    public float chover(float x) {
        return this.nivel += x;
    }
    
    public float ensolarar(float x) {
        return this.nivel -= x;
    }
    
    public void limpar() {
        this.poluido = false;
    }
    
    public void sujar() {
        this.poluido = true;
    }
    
    public String mostra () {
        return "Nome: " + this.nome + " Nivel: " + this.nivel + " Poluido: " + this.poluido;
    }
}
