public class elipse {

    private double r1;
    private double r2;
    private double  area;
    private double  perimetro;
    

    public elipse() {
        r1 = 0;
        r2 = 0;
        perimetro = 0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public void setR1(double x) {
        r1 = x;
    }
    
    public void setR2(double x) {
        r2 = x;
    }
    
    public void procesarArea() {
        area = Math.PI * r1 * r2;
    }

    public void procesarPerimetro() {
        perimetro = Math.PI * 2 * Math.sqrt(((r1*r1)+(r2+r2))/2);
    }
}