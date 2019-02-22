/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonas
 */

public class Carro {

    /**
     * @param args the command line arguments
     */
    private float vel;
    private boolean stm;
    
    public void ligar() {
        this.stm = true;
        this.vel = 0;
    }
    
    public void desligar() {
        this.stm = false;
        this.vel = 0;
    }

    public void acelerar(float x) {
        this.vel += x;
    }

    public void frear(float x) {
        this.vel -= x;
    }

    public String toStrind() {
        return "Vel: " + this.vel + " e Status:" + this.stm;
    }
}
