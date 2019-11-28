/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.seleccionados;

/**
 *
 * @author estudiante
 */
public class par {
    public static void main(String[] args) {
        String cad1;
        String cad2="hoy es jueves";
        String cad3="hoy Es juevez";
        boolean b, h;
        int x, y, z;
        char c;
        
        x = cad2.length();
        z = cad2.indexOf('s');
        z = cad2.indexOf("jueves");
        b = cad2.equals(cad3);
        h = cad2.equalsIgnoreCase(cad3);
        
        c = cad2.charAt(7);
        cad1 = cad2.substring(4);
        
        for (int i = 0; i < cad2.length(); i++) {
            System.out.println(cad2.charAt(i));
//            if (cad2.charAt(i) == "a") {
//                int cont++;
//            }
        }
        
        System.out.println("");
        
        System.out.println(x);
        System.out.println(z);
        System.out.println(c);
        System.out.println(cad1);
        if (b) {
            System.out.println("son iguales");
        } else {
            System.out.println("son distinta");
        }
        
        System.out.println("");
        
        if (h) {
            System.out.println("son iguales");
        } else {
            System.out.println("son distinta");
        }
    }
}
