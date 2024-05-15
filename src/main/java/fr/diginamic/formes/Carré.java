package fr.diginamic.formes;


public class Carré extends Rectangle {
    public Carré(double longueur) {
        super(longueur, longueur); 
    }

    
    @Override
    public double calculerPerimetre() {
        return 4 * longueur;
    }
}
