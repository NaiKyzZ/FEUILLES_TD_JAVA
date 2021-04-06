package Feuille4;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        int nbVal = 5;
        int nbAsked;
        int res = 0;
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            nbAsked = s.nextInt();
            res = res + nbAsked;
            i++;
        }
        System.out.println(res);
        System.out.println(res/nbVal);
    }
}
