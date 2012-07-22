
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.*;

/**
 *
 * @author Tontsu
 */
public class Quicksort {

    private static int[] sort(int[] table) {

        quicksort(table, 0, table.length-1);

        return table;
    }

    private static void quicksort(int[] A, int vasen, int oikea) {
        int jako = partition(A, vasen, oikea);

        if (vasen < jako - 1) {
            quicksort(A, vasen, jako-1);
        }
        if (jako < oikea) {
            quicksort(A, jako, oikea);
        }





    }

    private static int partition(int[] A, int vasen, int oikea) {

        int jako = A[(vasen + oikea) / 2];
        int i = vasen;
        int j = oikea;
        int apu;


        while (i <= j) {
            
            while (A[i] < jako) {
                  i++; }
            while (A[j] > jako) {
                  j--;}

//            do {
//                i++;
//            } while (A[i] < jako);
//
//            do {
//                j--;
//            } while (A[j] > jako);

            if (i <= j) {

                apu = A[i];
                A[i] = A[j];
                A[j] = apu;
                i++;
                j--;

            }
        }

        return i;


    }

    public static void main(String[] args) {

        int[] taulu = new int[20];

        Random satunnainen = new Random();
     
        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = satunnainen.nextInt(100);
        }

        for (int j = 0; j < taulu.length; j++) {
            System.out.print(" " + taulu[j]);
        }
        System.out.println("");

        taulu = sort(taulu);

        for (int j = 0; j < taulu.length; j++) {
            System.out.print(" " + taulu[j]);
        }
        System.out.println("");


    }
}
