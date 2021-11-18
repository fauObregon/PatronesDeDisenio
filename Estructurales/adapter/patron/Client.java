package adapter.patron;

/**
 * @author fobregon
 * 
 * Se aplica cuando:
 * Pretendemos usar una clase existente cuya interfaz no es compatible con la requerida.
 * Tenemos que implementar una clase que pueda ser reusable y que coopere con clases no relacionadas, es decir, las clases que no tienen necesariamente interfaces compatibles.
 * 
 * Ventajas: hace que dos interfaces incompatibles, sean compatibles. Sirve para encapsular clases que no controlamos, y que pueden cambiar.
 * Desventajas: Añade complejidad adicional al diseño.
 */

/**
 * Utiliza la funcionalidad de Adaptada de acuerdo a la interfaz Objetivo implementada por Adaptor.
 */
public class Client {

    public static void main(String[] args) {
        ITarget iTarget; //What client expects
        iTarget = new Adapter(new Adaptee("Adaptee One"));
        iTarget.request();
    }
}
