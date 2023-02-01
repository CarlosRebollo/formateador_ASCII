package iteradores;

import mensajes.Constantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteradorDeFilas {

    public static void iteracionDeFilas(int longitudMaximaCampoIntroducida, int numeroDeCamposPorLinea, List<String> lineasDeDatos, int i) {
        for (int j = 0; j < lineasDeDatos.size(); j++) {
            List<String> camposDeLaLinea = new ArrayList<>(Arrays.asList(lineasDeDatos.get(j).split(Constantes.COMA)));
            if (camposDeLaLinea.size() < numeroDeCamposPorLinea) {
                camposDeLaLinea.add(Constantes.VACIO);
            }
            String entradaActual = camposDeLaLinea.get(i);
            if (entradaActual.length() <= longitudMaximaCampoIntroducida) {
                int numeroEspaciosParaRellenar = longitudMaximaCampoIntroducida - entradaActual.length();
                if (numeroEspaciosParaRellenar != 0) {
                    String nuevaEntrada = String.format(Constantes.PORCENTAJE + longitudMaximaCampoIntroducida + Constantes.S, entradaActual);
                    camposDeLaLinea.set(i, nuevaEntrada);
                    String lineaActualizada = String.join(Constantes.COMA, camposDeLaLinea);
                    lineasDeDatos.set(j, lineaActualizada);
                }
            } else {
                System.out.println(Constantes.HAY_UN_CAMPO_DE_LA_COLUMNA + (i + 1) + Constantes.EN_FILA + (j + 1) + Constantes.QUE_EXCEDE_DE_LA_LONGITUD_DEL_CAMPO);
                throw new RuntimeException();
            }
        }
    }
}
