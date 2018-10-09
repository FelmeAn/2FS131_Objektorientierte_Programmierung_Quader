package main;

public class Quader {
    private double laenge,breite,hoehe;
    public Quader(double laenge, double breite, double hoehe){
        this.laenge=laenge;
        this.breite=breite;
        this.hoehe=hoehe;
    }
    public void flaecheBerechnenAusgeben(){
        System.out.println("-=[DATEN]=-");
        System.out.println("Länge: "+laenge);
        System.out.println("Breite: "+breite);
        System.out.println("Höhe: "+hoehe);
        System.out.println("-=[AUSGABE]=-");
        System.out.println("Fläche: "+(laenge*breite));
        System.out.println("Umfang: "+umfangBerechnen());
        System.out.println("Volumen: "+volumenBerechnen());
    }
    private double umfangBerechnen() {
        return (2*laenge)+(2*breite);
    }
    private double volumenBerechnen() {
        return laenge*breite*hoehe;
    }
}
