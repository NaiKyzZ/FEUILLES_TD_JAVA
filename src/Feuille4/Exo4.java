package Feuille4;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        int nbVal = 10;
        Scanner s = new Scanner(System.in);
        int nbAsked;
        int i = 0;
        while(i < nbVal){
            nbAsked = s.nextInt();
            if (nbAsked % 2 == 0){
                System.out.println("Pair");
            } else System.out.println("Impair");
            i++;
        }
    }
}
