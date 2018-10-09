package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double laenge,breite,hoehe;
        Scanner sc = new Scanner(System.in);
        laenge=input(sc, "Bitte gebe eine Länge an");
        breite=input(sc, "Bitte gebe eine Breite an");
        hoehe=input(sc, "Bitte gebe eine Höhe an");
        Quader q1 = new Quader(laenge,breite,hoehe);
        q1.flaecheBerechnenAusgeben();
    }
    private static double input(Scanner sc, String text){
        System.out.print(text+": ");
        return Double.parseDouble(sc.nextLine().replace("\\D", ""));
    }
}
