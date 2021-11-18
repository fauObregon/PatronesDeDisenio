package facade.ejemplos.computador;

/**
 * @author fobregon
 * 
 * Fachada: Clase que trata de ofrecer la funcionalidad que demanda el cliente mediante una interfaz sencilla donde, internamente, utiliza las clases subsistemas.
 */
public class FachadaComputador {

    private CPU cpu;
    private DiscoDuro discoDuro;
    private Memoria memoria;

    public FachadaComputador(){
        this.cpu       = new CPU();
        this.discoDuro = new DiscoDuro();
        this.memoria    = new Memoria();
    }

    public void start(){
        System.out.println("INICIANDO...");
        cpu.enfriar();
        memoria.cargar();
        discoDuro.leer();
        cpu.ejecutar();
    }

}
