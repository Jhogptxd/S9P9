import java.util.ArrayList;

public class Lienzo {

    private String titulo;
    private ArrayList<FiguraBase> figuras;

    public Lienzo(String titulo) {
        this.titulo = titulo;
        this.figuras = new ArrayList<>();
    }

    public void agregar(FiguraBase figura) {
        figuras.add(figura);
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (FiguraBase f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }

    public void mostrarFiguras() {
        System.out.println("Lienzo: " + titulo);
        for (FiguraBase f : figuras) {
            f.mostrarArea();
            System.out.println("--------------------");
        }
    }
}