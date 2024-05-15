package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	public Piece[] pieces= new Piece[0];
	
	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.etage >=0 && piece.superficie>0) {
			pieces= Arrays.copyOf(pieces, pieces.length+1);
			pieces[pieces.length-1]=piece;	
		} else {System.out.println("Vous devez ajouter une piece existante avec une superficie superieure a 0 et un étage (0 ou plus)");}
		
	}
	
	public double getSuperficie() {
		double superficieTotale=0;
		for(Piece piece:pieces) {
			superficieTotale+= piece.superficie;
			
		}
		return superficieTotale;
	}
	
	public double getSuperficieByEtage(int etage) {
		double superficieTotale=0;
		for(Piece piece:pieces) {
			if(etage==piece.etage) {superficieTotale+= piece.superficie;}
			
		}
		return superficieTotale;
	}
	
	public int nombrePiecesPourType(String type) {
        int count = 0;
        for (Piece piece : pieces) {
        	if (piece.getClass().getSimpleName().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }
	
	public double superficieTotalePourType(String type) {
        double superficie = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equalsIgnoreCase(type)) {
                superficie+=piece.superficie;
            }
        }
        return superficie;
}
}
