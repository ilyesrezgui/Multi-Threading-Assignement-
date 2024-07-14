package exercice8;

public class Peuple {
	
private Homme [] pays;
private int nbHommes;
private static int c;

public Peuple() {
	this.nbHommes = 0;
    pays =new Homme[100];
}

public void naissance(Homme h) {
	if(nbHommes<100) {
		pays[nbHommes]=h;
	    nbHommes++;
	 }
	 else
		 System.out.println("Tableau saturé!");
}

public void explorer()
{
	for(int i=0;i<nbHommes;i++)
	{
		pays[i].identité();
	}
}
}
