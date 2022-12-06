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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Notas Escolares");
        System.out.print("Quant. notas a iserir? ");
        int nNotas = (int) leiaFloat();
        
        float notas[] = new float[nNotas+1];//vetor de 5 posições

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida, tente novamente!");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i]; //acumula notas
        }//fim do for
        notas[nNotas] = notas[nNotas] / nNotas; //faz a média
        System.out.printf("Sua média foi de %.2f" , notas[nNotas]);
        if (notas[nNotas] >= 7) {
            System.out.println(", parabéns você aprovou.");
        } else {
            System.out.println(", infelizmente você não aprovou.");
        }//fim if
    }//fim main

    /**
     * Função validaNota serve para validar notas que estejam fora do intervalo
     * de 0 - 10.
     *
     * @param nota
     * @return
     */
    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;// || significa ou
    }//fim validaNota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é núm., tente novamente: ");
            return leiaFloat();
        }
    }//fim leiaFloat()

}
