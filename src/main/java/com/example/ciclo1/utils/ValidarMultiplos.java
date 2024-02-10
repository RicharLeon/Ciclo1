package com.example.ciclo1.utils;

import java.util.ArrayList;
import java.util.List;

public class ValidarMultiplos {

    /*
    Cliente envia dos datos.
    1. List de Numeros
    2. Numero entero

    Se necesita, validar cuales de los numeros de la lista
    son multiplos del dato 2
    Enviar en un String, los datos multiplos
     */

    // una lista no un array

    public String valMultiplos (List<Integer> numerosLista, int numeroMultiplo){
        List<String> multiplos = new ArrayList<String>();


        for(Integer numero :numerosLista ) {

            if (numero % numeroMultiplo == 0){
                multiplos.add(numero.toString());
            }
        }


        //return String.valueOf(multiplos);
        String resultado = String.join("", multiplos);
        return resultado;

    }



}
