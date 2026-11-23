public class Circulo extends FiguraBase {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Circulo");
    }
}