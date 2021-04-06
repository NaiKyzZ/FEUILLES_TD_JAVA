package Feuille3;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int nb;
        System.out.println("Entrez un nombre");
        Scanner s = new Scanner(System.in);
        nb = s.nextInt();
        if(nb % 2 == 0){
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }
    }
}
