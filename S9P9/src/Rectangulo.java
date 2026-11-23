public class Rectangulo extends FiguraBase {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Rectangulo");
    }
}