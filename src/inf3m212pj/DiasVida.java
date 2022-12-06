/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class DiasVida {

    /**
     * Refazer exercício do Portugol de calculo de dias de vida aproximado
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int diasVida, idade;
        
        System.out.println("Calculadora de Dias de Vida Aproximado");
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        //diasVida = idade * 365;
        diasVida = caldDias(idade);//usando função para calcular os dias de vida
        System.out.println("Você já viveu " + diasVida + " dias de vida aproximadamente!");
        
    }
    
    public static int caldDias(int old){
        return old * 365;
    }
    
}
