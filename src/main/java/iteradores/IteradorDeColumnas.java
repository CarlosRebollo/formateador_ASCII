package iteradores;

import mensajes.Constantes;

import java.util.List;
import java.util.Scanner;

public class IteradorDeColumnas {

    public static void iteracionDeColumnas(Scanner sc, int numeroDeCamposPorLinea, List<String> lineasDeDatos) {
        int longitudMaximaCampoIntroducida;
        for (int i = 0; i < numeroDeCamposPorLinea; i++) {
            System.out.println(Constantes.VOY_A_LEER_LA_COLUMNA_NUMERO + (i + 1));
            System.out.print(Constantes.CUAL_ES_EL_MAXIMO_DE_CARACTERES_QUE_TIENE_LA_COLUMNA);
            longitudMaximaCampoIntroducida = sc.nextInt();
            System.out.println(longitudMaximaCampoIntroducida + Constantes.CARACTER_ES_LEYENDO);
            IteradorDeFilas.iteracionDeFilas(longitudMaximaCampoIntroducida, numeroDeCamposPorLinea, lineasDeDatos, i);
        }
    }
}
