package Trabalho_13_03_2023_Professor;

public class Retangulo {
    private Ponto supEsq;
	private Ponto infDir;
	
	public Retangulo() {}
	
	public Retangulo(Ponto supEsq, Ponto infDir) {	
		this.supEsq = supEsq;
		this.infDir = infDir;
	}

	public Ponto getSupEsq() {
		return supEsq;
	}

	public void setSupEsq(Ponto supEsq) {
		this.supEsq = supEsq;
	}

	public Ponto getInfDir() {
		return infDir;
	}

	public void setInfDir(Ponto infDir) {
		this.infDir = infDir;
	}
	
	public double getArea() {
		double base = this.infDir.getX() - this.supEsq.getX();
		double altura = this.supEsq.getY() - this.infDir.getY();
		double area = base*altura;
		if(area < 0) {
			area *=-1;
		}
		return area;
	}
	
	public double getDiagonal() {
		return this.supEsq.distancia(this.infDir);
	}
	
	public double getPerimetro() {
		double base = this.infDir.getX() - this.supEsq.getX();
		double altura = this.supEsq.getY() - this.infDir.getY();
		double perimetro = ((2*base) + (2*altura));
		if(perimetro < 0) {
			perimetro *= -1;
		}
		return perimetro;
	}
	
	public boolean pertence(Ponto p) {
		if(p.getX()>= this.supEsq.getX() && p.getX()<=this.infDir.getX()
		&& p.getY()<=this.supEsq.getY() && p.getY() >= this.infDir.getY()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Ponto Superior Esquerdo: " + this.supEsq +
				"\nPonto Inferior Direito: " + this.infDir;
	}
}
