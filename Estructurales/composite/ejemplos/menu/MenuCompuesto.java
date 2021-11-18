package composite.ejemplos.menu;

import java.util.ArrayList;

/**
 * @author fobregon
 * 
 * Compuesta: Este componente es el que le da vida al patron de diseño ya que este objeto esta conformado por un conjunto de Componentes y hojas. 
 * En teoria de Arboles este componente representara una rama.
 */
public class MenuCompuesto extends MenuComponente {

    private ArrayList<MenuComponente> menuComponentes;

    public MenuCompuesto(String nombre) {
        this.nombre = nombre;
        menuComponentes = new ArrayList<>();
    }

    @Override
    public void add(MenuComponente componente) {
        this.menuComponentes.add(componente);
    }

    @Override
    public void remove(MenuComponente componente) {
        this.menuComponentes.remove(componente);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void imprimir() {

        System.out.print(identado.toString() + "* " + getNombre() + "\n");
        //System.out.println(identado.toString() + "---------------------");
        identado.append("     ");
        for(MenuComponente menuComponente : menuComponentes){
            menuComponente.imprimir();
        }
        identado.setLength(identado.length() - 5);
    }
}
