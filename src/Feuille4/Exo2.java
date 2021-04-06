package Feuille4;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int nb;
        System.out.println("Entrez un nombre de tiret que vous voulez afficher");
        Scanner s = new Scanner(System.in);
        nb = s.nextInt();
        int i = 1;
        while (i <= nb){
            System.out.print("-");
            i++;
        }
    }
}
