package POOInterface;

public class App {
    public static void main(String[] args) {

        // Quadrado figura1 = new Quadrado(6);
        // System.out.println("Area="+figura1.getArea()
        // +" Perimetro="+figura1.getPerimetro()+" "
        // +figura1.getNomeFigura());

    //   Retangulo retangulo = new Retangulo(5, 12);
    //   System.out.println("Area: "  + retangulo.getArea() + " Perimetro: "  + retangulo.getPerimetro());

    Trapezio trapezio = new Trapezio(10, 6, 5);
    System.out.println("Area: " + trapezio.getArea() + " Perimetro: "  + trapezio.getPerimetro());
       
    }
}