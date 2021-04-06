package Feuille3;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        int age;
        System.out.println("Quel est votre âge ?");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();

        if(age >= 18){
            System.out.println("Je suis un adulte");
        }
    }
}
