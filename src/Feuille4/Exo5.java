package Feuille4;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        int nbVal;
        int nbAsked;
        int res = 0;
        Scanner s = new Scanner(System.in);
        int i = 0;
        System.out.println("Entrez un nb de valeur");
        nbVal = s.nextInt();
        while(i < nbVal){
            nbAsked = s.nextInt();
            res = res + nbAsked;
            i++;
        }
        System.out.println(res);
        System.out.println(res/nbVal);
    }
}
