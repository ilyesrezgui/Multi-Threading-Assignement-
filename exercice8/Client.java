package exercice8;

public class Client extends Personne implements Homme{
	private int numero;

	public Client(String nom, String prenom, int numero) {
		super(nom, prenom);
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void identité() {
		
		super.identité();
		System.out.println(",numero"+numero);
	}
	
    
}
