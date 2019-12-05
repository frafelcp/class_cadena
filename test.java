/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claPM;

/**
 *
 * @author estudiante
 */
public class test {
    public static void main(String[] args) {
        String cad1="hoy es jueves";
        String cad2="hoy es dia de trabajo";
        String cad3="hoy no llueve";
        String cad4="quiero un carro";
        String [] palabras = cad4.split(" ");
        
        int x = cad1.compareTo(cad2);
        int y = cad1.compareTo(cad3);
        if (x>0 && y>0) {
            
        }
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
