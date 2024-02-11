package Trabalho_13_03_2023_Professor;

public class Ponto {
    private double x;
	private double y;
	
	public Ponto() {}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double distancia(Ponto p) {
		double xquadrado = (p.getX()-this.x)*(p.getX()-this.x);
		double yquadrado = (p.getY()-this.y)*(p.getY()-this.y);
		double dist = Math.sqrt(xquadrado + yquadrado);
		return dist;
	}
	
	public String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}
}
