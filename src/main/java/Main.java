import mensajes.Constantes;
import rw.Conversor;

import java.io.IOException;

/**
 * Formateador de ficheros *.ascii atendiendo a la longitud máxima de caracteres
 * de cada campo.
 * El programa detectará las columnas de datos e irá preguntando una por una
 * cuál es su máximo de caracteres.
 * En caso de ser menor, rellenará de espacios en blanco a la izquierda para
 * lograr la longitud deseada, si excede
 * esa longitud, se cancelará la operación, informando al usuario del lugar
 * exacto donde se ha producido el error.
 *
 * @author carlos.rebollogarcia
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Conversor.conversorDeArchivosASCII(Constantes.PATH_DEL_ARCHIVO);
    }
}
