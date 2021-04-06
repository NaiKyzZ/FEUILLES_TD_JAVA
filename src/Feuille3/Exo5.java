package Feuille3;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        int nb1, nb2, nb3;
        System.out.println("Entrez 3 nombres");
        Scanner s = new Scanner(System.in);
        nb1 = s.nextInt();
        nb2 = s.nextInt();
        nb3 = s.nextInt();
        System.out.println(nb1 % 2 == 0);
        System.out.println(nb1 % 2 == 1);
        System.out.println(nb1 % nb2 == 0);
        System.out.println(nb1 < nb2);
        System.out.println((nb1 <= nb2 && nb2 < nb3) || (nb1 > nb2 && nb2 > nb3));
    }
}
