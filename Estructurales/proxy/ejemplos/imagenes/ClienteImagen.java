package proxy.ejemplos.imagenes;

/**
 * 
 * @author fobregon
 * 
 * Cliente: precisa de los servicios de Imagen (Subject) aunque trabaja con una referencia Apoderada (ProxyImagen).
 */
public class ClienteImagen  {

    public static void main(String[] args) {

        IImagen iImagen = new ProxyImagen("img_10.jpg");

        //la imagen se cargar� desde el disco
        iImagen.mostrar();
        System.out.println("");

        //la imagen NO se cargar� desde el disco
        iImagen.mostrar();
    }

}
