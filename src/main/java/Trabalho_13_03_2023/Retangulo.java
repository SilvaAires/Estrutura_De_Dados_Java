package Trabalho_13_03_2023;

public class Retangulo {
    private Ponto supEsq;
    private Ponto infDir;

    public Retangulo() {
    }

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
    
    public double getArea(){
        double base = this.getInfDir().getX() - this.getSupEsq().getX();
        double altura = this.getSupEsq().getY() - this.getInfDir().getY();
        double area = base * altura;
        if (area < 0){
            area *= -1;
        }
        return area;
    }
    
    public double getDiagonal(){
        return this.supEsq.distancia(this.infDir);
    }
    
    public double getPerimetro(){
        double base = this.getInfDir().getX() - this.getSupEsq().getX();
        double altura = this.getSupEsq().getY() - this.getInfDir().getY();
        double perimetro = ((2*base) + (2*altura));
        if (perimetro < 0 ){
            perimetro *= -1;
        }
        return perimetro;
    }
    
    public boolean verfPonto(Ponto p){
        if ((p.getX()>=this.supEsq.getX() && p.getX()<=this.infDir.getX())
                && p.getY()<=this.supEsq.getY() && p.getY()>=this.infDir.getY()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "\nPonto supEsq=" + supEsq + ",\nPonto infDir=" + infDir + '}';
    }
}
