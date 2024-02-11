package Trabalho_13_03_2023;

public class Ponto {
    //atributos
    private double x;
    private double y;

    //metodos especiais
    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //metodos
    
    public double distancia(Ponto p){
        double xquadrado = (p.getX() - this.x)*(p.getX() - this.x);
        double yquadrado = (p.getY() - this.y)*(p.getY() - this.y);
        double dist = Math.sqrt(xquadrado + yquadrado);
        return dist;
    }
    
    @Override
    public String toString(){
        return "["+this.getX()+" , "+this.getY()+"]";
    }
    
    /*void status (){
        System.out.println("X: " + this.getX() + " Y " + this.getY());
    }*/
}
