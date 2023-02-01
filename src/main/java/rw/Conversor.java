package rw;

import iteradores.IteradorDeColumnas;
import mensajes.Constantes;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Conversor {

    public static void conversorDeArchivosASCII(String path) throws IOException {
        BufferedReader readFileBuffer = null;
        FileWriter writer = null;
        try {
            Scanner sc = new Scanner(System.in);
            FileReader fr = new FileReader(path);
            readFileBuffer = new BufferedReader(fr);
            String lineaDeMuestra = readFileBuffer.readLine();
            int numeroDeCamposPorLinea = lineaDeMuestra.replaceAll(Constantes.REGEX_COMA, Constantes.VACIO).length() + 1;
            File data = new File(path);
            List<String> lineasDeDatos = Files.readAllLines(data.toPath());
            IteradorDeColumnas.iteracionDeColumnas(sc, numeroDeCamposPorLinea, lineasDeDatos);
            writer = EscrituraDeDatos.escrituraDeDatos(path, lineasDeDatos);
        } catch (IOException e) {
            System.out.print(Constantes.ALGO_HA_IDO_MAL);
            System.out.print(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(Constantes.INTRODUCE_SOLO_NUMEROS);
        } catch (NullPointerException e) {
            System.out.println(Constantes.FICHERO_VACIO);
        } finally {
            if (readFileBuffer != null) {
                readFileBuffer.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
