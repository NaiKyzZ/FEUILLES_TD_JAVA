package Feuille3;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        int nb1, nb2;
        System.out.println("Entrez un premier nombre:");
        Scanner s = new Scanner(System.in);
        nb1 = s.nextInt();
        System.out.println("Entrez un deuxième nombre:");
        nb2 = s.nextInt();
        if (nb1 > nb2){
            System.out.println("Le premier nombre est supérieur au second");
        }else if (nb2 > nb1){
            System.out.println("Le second nombre est supérieur au premier");
        }else if (nb2 == nb1){
            System.out.println("Les nombres sont égaux");
        }
    }
}
