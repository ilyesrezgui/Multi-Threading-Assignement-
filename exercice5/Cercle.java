package exercice5;

public class Cercle extends Point  {
protected double rayon;
final double pi=3.14;

public Cercle(double x, double y,double rayon) {
	super(x, y);
	this.rayon=rayon;
}
public double surface() {
	return pi*rayon*rayon;
}
@Override
public String toString() {
	return " rayon:" + rayon + ", centre:" + super.toString() ;
}


}
