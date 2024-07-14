package exercice8;

public class Personne implements Homme {
	private String nom,prenom;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public void identité() {
		System.out.println("Nom: "+nom+" ,Prenom: "+prenom);		
		
	}

	
	
	

}
