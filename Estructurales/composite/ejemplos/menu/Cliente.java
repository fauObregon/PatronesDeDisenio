package composite.ejemplos.menu;

public class Cliente {

    private MenuComponente todosLosMenus;

    public Cliente(MenuComponente todosLosMenus) {
        this.todosLosMenus = todosLosMenus;
    }

    public void imprimirMenu() {
        todosLosMenus.imprimir();
    }
}
