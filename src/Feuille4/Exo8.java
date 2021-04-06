package Feuille4;


import java.util.Scanner;

public class Exo8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int nb = 0;
        int max = 0;

        while (nb > -1) {
            System.out.println("Veuillez entrer un nombre");
            nb = s.nextInt();

            if (nb > max) {
                max = nb;
            }
            i++;
        }

        System.out.println("Le plus grand nombre est " + max + ".");

    }

}
