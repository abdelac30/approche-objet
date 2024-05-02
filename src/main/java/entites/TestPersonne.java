package entites;

import entites2.Personne;


public class TestPersonne {

 public static void main(String[] args) {
	Personne personne = new Personne();
    personne.firstname = "Alain";
    personne.lastname = "Delon";
    personne.adressePostale = new AdressePostale();
    personne.adressePostale.street_number = "20";
    personne.adressePostale.street = "rue des choux";
    personne.adressePostale.zipcode = "30000";
    personne.adressePostale.city = "Nimes";

}

}