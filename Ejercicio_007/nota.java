public class nota {
    /////////Atributos////////
    private double corteUno;
    private double corteDos;
    private double corteTres;
    private double corteDefinitiva;
    
    //////////Constructor/////////
    public nota() {
        corteUno = 0;
        corteDos = 0;
        corteTres = 0;
        corteDefinitiva = 0;
    }
    ////////////GET///////////////
    public double getDefinitiva() {
        return corteDefinitiva;
    }
    
    public double getCorteUno() {
        return corteUno;
    }
    
    public double getCorteDos() {
        return corteDos;
    }
    
    public double getCorteTres() {
        return corteTres;
    }
    ///////////////SET/////////////
    public void setCorteUno(double x) {
        corteUno = x;
    }
    
    public void setCorteDos(double x) {
        corteDos = x;
    }
    
    public void setCorteTres(double x) {
        corteTres = x;
    }
    ///////////////////////////////////
    public void procesarDefinitiva() {
        corteDefinitiva = (corteUno*0.3)+(corteDos*0.3)+(corteTres*0.4);
    }
}