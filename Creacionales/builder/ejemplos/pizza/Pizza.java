package builder.ejemplos.pizza;

/**
 * @author fobregon
 * 
 * Producto: Objeto que se ha construido tras el proceso definido por el patrón.
 */
public class Pizza {

    private Masa masa;
    private Salsa salsa;
    private Ingrediente cubierta;

    public Pizza(){}

    public Masa getMasa() {
        return masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public Ingrediente getCubierta() {
        return cubierta;
    }

    public void setCubierta(Ingrediente cubierta) {
        this.cubierta = cubierta;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();

        salida.append("Esta es una pizza con masa " + getMasa() +  ", salsa " + getSalsa());

        if(cubierta != null){
            salida.append(" y " + cubierta);
        }

        salida.append(".");

        return salida.toString();
    }
}
