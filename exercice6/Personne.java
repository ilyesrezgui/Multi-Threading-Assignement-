package exercice6;

public class Personne {
	
protected String nom;

public Personne(String nom) {
	this.nom = nom;
}

@Override
public String toString() {
	return "je suis " + nom ;
}

}
