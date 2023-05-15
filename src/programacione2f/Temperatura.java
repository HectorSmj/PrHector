package programacione2f;
public class Temperatura {
    public double c;
    public double f;

    public Temperatura(double c, double f) {
        this.c = c;
        this.f = f;
    }

    public Temperatura() {
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    
    public double caf(){
        double fa=(1.8)*c+32;
        return fa;
    }
     public double fac(){
        double ce=(f-32)/1.8;
        return ce;
    }
    
}
