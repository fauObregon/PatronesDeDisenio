/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.ejemplos.menu;

/**
 *
 * @author fobregon
 * 
 * MenuItem: El leaf u hoja, representa la parte mas simple o pequeña de toda la estructura y esta hereda de Componente. 
 * Leaf recibe su nombre de la teoria de arboles, donde se le nombra asi a todo nodo que no tiene descendencia, 
 * en este caso son clases simple que no estan compuestas de otras.
 */
public class MenuItem extends MenuComponente {

    private boolean vegetariano;
    private double precio;

    public MenuItem(String nombre, boolean vegetariano, double precio) {
        this.nombre = nombre;
        this.vegetariano = vegetariano;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public boolean esVegetariano() {
        return this.vegetariano;
    }

    @Override
    public void imprimir() {
        System.out.print(identado.toString() + "# " +  getNombre());
        if (esVegetariano()) {
            System.out.print("(v)");
        }
        System.out.println("," + getPrecio());
    }

}
