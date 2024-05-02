
public class Nodo {
    private int num=0;
    public Nodo derecha = null;
    public Nodo izquierda = null;
    
    Nodo(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Nodo{" + "num=" + num + '}';
    }
}
