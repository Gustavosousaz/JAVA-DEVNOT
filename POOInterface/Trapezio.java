package POOInterface;

public class Trapezio implements FiguraGeometrica {
    int baseMaior;
    int altura;
    int baseMenor;
    int LA;
    int LB;
     
    
    public Trapezio(int baseMaior, int altura, int baseMenor) {
        this.baseMaior = baseMaior;
        this.altura = altura;
        this.baseMenor = baseMenor;
        
        
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        int area = (baseMaior+baseMenor)*altura/2;
        return area;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Trapezio";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
int perimetro = baseMaior+baseMenor+LA+LB;
        return perimetro;
    }
    
    
}
