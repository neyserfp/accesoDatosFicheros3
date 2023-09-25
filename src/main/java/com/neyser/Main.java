package com.neyser;

import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //File file1 = new File("carpetaDatos1");
        File file1 = new File("carpetaDatos1/datos1.txt");

        try
        {
            // FileWriter: false, sobreescribe datos
            // FileWriter: true, añadir datos
            if (file1.createNewFile())
            {
                System.out.println("El fichero ha sido creado");
            } else
            {
                System.out.println("El fichero NO ha sido creado");
            }
        } catch (IOException e)
        {
            System.out.println("Error, no se pudo crear el fichero "+e.getMessage());
            e.printStackTrace();
        }



    }
}