package com.example.ciclo1.utils;

import java.util.List;

public class Montos {
    public String controllMontos(List<Integer> montos, Long id, Integer facturaTotal){

    montos.size();
        Integer montoTotal = montos.get(0);
        Integer montoDescuento =  montos.get(1);
        Integer porcentaje = montoTotal * 100 / montoDescuento;


        if (montoDescuento > montoTotal) {
            return ("Descuento");
        } else {
            facturaTotal = montoTotal - montoDescuento;
            return ("El porcentaje de descuento es" + porcentaje + "%");
        }



    }




}
