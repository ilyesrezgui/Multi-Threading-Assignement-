package exercice5;

public class Cylindre extends Cercle {
protected double hauteur;

public Cylindre(double x, double y, double rayon,double hauteur) {
	super(x, y, rayon);
	this.hauteur=hauteur;
}

@Override
public double surface() {
	// TODO Auto-generated method stub
	return 2*super.surface()+pi*2*rayon*hauteur;
}

@Override
public String toString() {
	return "hauteur:" + hauteur + super.toString() ;
}

}
