/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class DiasVidaExato {

    /**
     * Refazer exercício do Portugol de calculo de dias de vida aproximado
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        long diasVida;
        LocalDate dtNasc, dtAtual = LocalDate.now();

        System.out.println("Calculadora de Dias de Vida Aproximado");
        System.out.print("Digite sua data de nascimento: ");
        dtNasc = LocalDate.parse(leia.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dtNasc + "|" + dtAtual);
        diasVida = ChronoUnit.DAYS.between(dtNasc, dtAtual);
        System.out.println("Você já viveu " + diasVida + " dias de vida exato!");

    }
}
