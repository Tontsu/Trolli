/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trolo;

import java.util.*;
/**
 *
 * @author Tontsu
 */
public class Trolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] taulu = new int[10000000];
        
        Random random = new Random();
        
        
        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = random.nextInt();
            System.out.println(taulu[i]);
        }
    }
}
