package composite.ejemplos.menu;

/**
 * @author fobregon
 */

/**
 * El patron de diseño Composite nos sirve para construir estructuras complejas partiendo de otras mucho mas simples; 
 * dicho de otra manera, 
 * podemos crear estructuras compuestas que estan conformadas por otras estructuras mas pequeñas.
 */
public class TestMenu {


    public static void main(final String args[]) {

        final MenuComponente comidas	= new MenuCompuesto("Comidas");
        final MenuComponente cenas		= new MenuCompuesto("Cenas");
        final MenuComponente postres	= new MenuCompuesto("Postres");
        final MenuComponente platoFuerte = new MenuCompuesto("Plato Fuerte");

        final MenuComponente todosLosMenus = new MenuCompuesto("Menus");

        todosLosMenus.add(comidas);
        todosLosMenus.add(cenas);

        comidas.add(platoFuerte);
        comidas.add(postres);

        platoFuerte.add(new MenuItem(
                        "Pollo Crispy",
                        false,
                        100.89)
        );
        
        postres.add(new MenuItem(
                        "Pie de Manzana",
                        false,
                        15.59)
        );
        
        postres.add(new MenuItem(
                        "Cheesecake",
                        false,
                        19.99)
        );        
        
        cenas.add(new MenuItem(
                        "Hotdogs",
                        false,
                        6.05)
        );
        
        cenas.add(new MenuItem(
                        "Tallarin",
                        true,
                        30.89)
        );


        //El cliente no distingue entre item y un compuesto.
        Cliente cliente = new Cliente(todosLosMenus);
        cliente.imprimirMenu();

    }

}
