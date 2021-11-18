package proxy.ejemplos.imagenes;

/**
 * 
 * @author fobregon
 *
 * Apoderada (ProxyImagen): 
 * Mantiene una referencia al objeto real además de implementar la interfaz Imagen (Subject). 
 * El cliente trabajará con este objeto como si fuese el objeto real.
 */
public class ProxyImagen implements IImagen {

    private RealImagen realImagen;
    private String nombreArchivoImagen;

    public ProxyImagen(String fileName){
        this.nombreArchivoImagen = fileName;
    }

    @Override
    public void mostrar() {
        if(realImagen == null){
            realImagen = new RealImagen(nombreArchivoImagen);
        }
        realImagen.mostrar();
    }

}
