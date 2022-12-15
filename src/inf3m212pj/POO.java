/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import model.Carro;


/**
 *
 * @author jbferraz
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car1 = new Carro("abc1234", 321, "Fiat", "Palio", 
                2008, 2009, 1.0f, "Manual", "Hidraulica");
        System.out.println("Carro 1: " + car1.toString());
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Placa: " + car1.getPlaca());
    }
    
}
