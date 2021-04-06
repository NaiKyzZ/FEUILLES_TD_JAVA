package Feuille3;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        int nb1, nb2, nb3;
        System.out.println("Entrez 3 valeur de triangle");
        Scanner s = new Scanner(System.in);
        nb1 = s.nextInt();
        nb2 = s.nextInt();
        nb3 = s.nextInt();
        if ((nb1 == nb2 && nb2 == nb3)){
            System.out.println("Triangle équilatéral");
        }
        else if ((nb1 == nb2 && nb2 != nb3)  || (nb2 == nb3 && nb2 != nb1) || (nb3 == nb1 && nb3 != nb2)){
            System.out.println("Triangle isocèle");
        }
        else if ((nb1 != nb2 && nb1 != nb3) && (nb2 != nb3)){
            System.out.println("Triangle quelconque");
        }

    }
}
