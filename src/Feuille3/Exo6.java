package Feuille3;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        int nb1, nb2, nb3;
        System.out.println("Entrez 3 nombres");
        Scanner s = new Scanner(System.in);
        nb1 = s.nextInt();
        nb2 = s.nextInt();
        nb3 = s.nextInt();
        if (nb1 > nb2 && nb1 > nb3){
            System.out.println(nb1 + "est le plus grand ");
        }
        else if (nb2 > nb3 && nb2 > nb1){
            System.out.println(nb2 + "est le plus grand ");
        }
        else if (nb3 > nb2 && nb3 > nb1){
            System.out.println(nb3 + "est le plus grand ");
        }
    }
}
