package Feuille4;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        int nb;
        System.out.println("Entrez un nombre");
        Scanner s = new Scanner(System.in);
        nb = s.nextInt();
        int i = 0;
        while (i <= 100) {
            if((i % nb == 0)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
