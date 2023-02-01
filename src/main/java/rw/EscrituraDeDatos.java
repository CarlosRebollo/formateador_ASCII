package rw;

import mensajes.Constantes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscrituraDeDatos {

    public static FileWriter escrituraDeDatos(String pathArchivo, List<String> lineasDeDatos) throws IOException {
        FileWriter writer = new FileWriter(pathArchivo);
        for (String linea : lineasDeDatos) {
            writer.write(linea.replace(Constantes.COMA, Constantes.VACIO) + System.lineSeparator());
        }
        System.out.println(Constantes.FICHERO_SOBREESCRITO_CON_EXITO_SALIENDO);
        return writer;
    }
}
