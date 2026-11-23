public abstract class FiguraBase implements Figura {

    public abstract void mostrarNombre();

    public void mostrarArea() {
        mostrarNombre();
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
    }
}