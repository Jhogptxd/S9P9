public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(3.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 5.0);

        Lienzo lienzo = new Lienzo("Mi dibujo");
        lienzo.agregar(circulo);
        lienzo.agregar(rectangulo);

        System.out.println("===== FIGURAS =====");
        lienzo.mostrarFiguras();

        System.out.println("Area total: " + String.format("%.2f", lienzo.calcularAreaTotal()));
    }
}