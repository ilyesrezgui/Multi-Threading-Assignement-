package exercice5;

public class Point {
	protected double x;
	protected double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	public String toString() {
		return " ("+x+","+y+")";		
	}
}
