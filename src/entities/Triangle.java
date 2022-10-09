package entities;

public class Triangle {
    public double a,b,c;

    public double area(){
        double p = (a + b + c)/2.0;
        return Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
    }
}
