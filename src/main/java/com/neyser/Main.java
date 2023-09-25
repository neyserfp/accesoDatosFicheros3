package com.neyser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        //File file1 = new File("carpetaDatos1");
        File file1 = new File("carpetaDatos1/datos1.txt");

        try
        {
            // Creamos un objeto que permita escribir en un fichero
            // FileWriter: false, sobreescribe datos
            // FileWriter: true, añadir datos

            FileWriter fileWriter1 = new FileWriter("carpetaDatos1/datos1.txt", true);

            fileWriter1.write("Línea 1\nLínea 2\n");
            fileWriter1.write("Línea 3");
            fileWriter1.close();
            System.out.println("Se ha escrito en el fichero");

            /*
            if (file1.createNewFile())

            {
                System.out.println("El fichero ha sido creado");
            } else
            {
                System.out.println("El fichero NO ha sido creado");
            }
            */

        } catch (IOException e)
        {
            System.out.println("NO SE HA ESCRITO EN EL FICHERO");

            e.printStackTrace();
        }



    }
}