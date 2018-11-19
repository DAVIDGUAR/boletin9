package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Contador {

    public void calcularNum() {
        int num = 0;

        int negativo = 0, positivo = 0, neutro = 0;
        
        Scanner ler = new Scanner(System.in);
        
        for (int contador = 0; contador < 10; contador++) {
            
            System.out.println("tecle numero = ");
            
        num=ler.nextInt();
        
        
        
            //pido numero por scanner, jsoulpaint
            if (num < 0) {
                negativo++;
                System.out.println("numero é negativo = ");
            } else {
                if (num > 0) {
                    positivo++;
                    System.out.println("numero é positivo = ");
                } else {
                    neutro++;
                    System.out.println("numero é neutro = ");
                }
                
            }
        }
        System.out.println("positivos = "+ positivo +"\nnegativos = "+ negativo+"\nneutros = "+ neutro);
        
        
    }
}
