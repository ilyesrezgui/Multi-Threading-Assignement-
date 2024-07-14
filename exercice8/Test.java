package exercice8;

public class Test {

	public static void main(String[] args) {
		
		Homme h1=new Personne("Mhiri","Nour");
		Homme h2=new Client("Morghom","Nada",22);
		Homme h3=new Personne("Rezghi","Ilyes");
		
		Peuple pays= new Peuple();
		
		pays.naissance(h1);
		pays.naissance(h2);
		pays.naissance(h3);
		
		pays.explorer();

	}

}
