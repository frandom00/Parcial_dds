import java.io.IOException;

public class TopRated extends Busqueda{

    public static void realizarBusqueda() throws IOException {
        Ruleta miRuleta = Ruleta.getInstancia();
        (miRuleta.obtenerPelicula()).mostrarPeli();
        return;
    }

    public static Pelicula obtenerPelicula() throws IOException{
        Ruleta miRuleta = Ruleta.getInstancia();
        return miRuleta.obtenerPelicula() ;
    }
}
