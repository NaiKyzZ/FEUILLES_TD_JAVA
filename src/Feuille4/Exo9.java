package Feuille4;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
        int nbMin = 0;
        int nbMax = 0;
        int nbVal;
        int nb;
        int i = 0;
        System.out.println("Entrez le nb de valeur que vous souhaitez");
        Scanner s = new Scanner(System.in);
        nbVal = s.nextInt();

        while (i < nbVal){
            System.out.println("Entrez un nombre");
            nb = s.nextInt();

            if (nb > nbMax){
                nbMax = nb;
            }
            else if (nb < nbMin){
                nbMin = nb;
            }
            i++;
        }
        System.out.println("Max: " + nbMax + " Min: " + nbMin);

    }
}
