package exercice5;

public class Test {
public static void main(String []args) {
	Point p=new Point(2.0,2.0);
	System.out.println("Point -> "+p);
	Cercle c=new Cercle(2.0,2.0,3.0);
	System.out.println("Cercle -> "+c+" ,surface:"+c.surface());
	Cylindre ce=new Cylindre(2.0,2.0,3.0,10.0);
	System.out.println("Cylindre -> "+ce+" ,surface:"+ce.surface());
}
}
