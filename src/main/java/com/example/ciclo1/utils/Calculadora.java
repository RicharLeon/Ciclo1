package com.example.ciclo1.utils;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class Calculadora {

   public void llamadoNumeros(int num1, int num2, int operacion){

       switch (operacion){
           case 1: sumar(num1, num2);
           break;
           case 2:restar(num1,num2);
           break;
           case 3: multiplicar(num1, num2);
           break;
           case 4:division(num1,num2);
           break;
           default:
               System.out.println("numero no valido");
               break;
       }
   }

    public int sumar (int numero1, int numero2){

        int sumar = numero1 + numero2;
        return sumar;

    }

    public int restar(int numero1, int numero2){

        int restar = numero1 - numero2;
        return restar;
    }

    public int multiplicar(int numero1, int numero2){

        int multiplicar = numero1 * numero2;
        return multiplicar;

    }

    public double division(int numero1, int numero2){

        double division = numero1 / numero2;
        return division;

    }







}
