package proxy.ejemplos.imagenes;

/**
 * 
 * @author fobregon
 * 
 * RealImagen: Objeto real que implementa la funcionalidad definida por la interfaz Imagen.
 *
 */
public class RealImagen implements IImagen {

    private String nombreArchivoImagen;

    public RealImagen(String nombreArchivoImagen){
        this.nombreArchivoImagen = nombreArchivoImagen;
        cargarDesdeDisco(nombreArchivoImagen);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + nombreArchivoImagen);
    }

    private void cargarDesdeDisco(String nombreArchivoImagen){
        System.out.println("Cargando " + nombreArchivoImagen);
    }

}
