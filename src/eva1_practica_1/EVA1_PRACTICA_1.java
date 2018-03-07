/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_1;

import com.sun.org.apache.bcel.internal.generic.IASTORE;
import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
/*PRACTICA 1:
CAPTURAR EDADES: 
    SOLICITAR AL USUARIO LA CANTIDAD DE EDADES A CAPTURAR.
    CAPTURAR LA CANTIDAD DE EDADES SOLICITADAS(ENTEROS).
CALCULAR: 
    LA MEDIA
    LA MODA
    DESVIACION ESTANDAR
    LA MEDIANA- NO SE PUEDE CALCULAR HASTA QUE SEPAMOS COMO ORDENAR ARREGLOS

*/
public class EVA1_PRACTICA_1 {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){   
        //CREAMOS ARREGLO Y PEDIMOS LAS EDADES 
        int aiEdades[];
        Scanner scCaptura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de edades que desea capturar: ");
        int iCantidad = scCaptura.nextInt();
        aiEdades = new int [iCantidad];
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Ingresa la edad: ");
            aiEdades[i] = scCaptura.nextInt();
        }
        //MOSTRAMOS LAS EDADES CAPTURADAS 
        for (int b : aiEdades) {
            System.out.println("Edad= " + b);   
        }
        //SACAMOS LA MEDIA DE LAS EDADES 
        double iSuma =0;
        double iMedia =0;
        for (int j : aiEdades) {
            iSuma=iSuma+j;
        }
        //IMPIRMIMOS LA MEDIA DE LAS EDADES 
        iMedia = iSuma /aiEdades.length;
        System.out.println("La media de las edades es: " + iMedia);
        //SACAMOS LA MODA 
        int iMaxima =0;
        int iModa =0;
        for (int i = 0; i < aiEdades.length; i++) {
            int iVeces =0;
            for (int j = 0; j < aiEdades.length; j++) {
                if(aiEdades[i] == aiEdades[j])
                    iVeces++;
            }
            if(iVeces > iMaxima){
                iModa= aiEdades[i];
                iMaxima = iVeces;
            }
        }
        //IMPRIMIMOS LA MODA DE LAS EDADES Y CUANTAS VECES SE REPITE
        System.out.println("La moda es: " + iModa + " y se repitió: " + iMaxima + " veces");
        //SACAMOS LA DESVIACION ESTANDAR, PERO ANTES SACAMOS LA VARIANZA
        double varianza = 0;
        double iDesviacion =0;
        for (int i = 0; i < aiEdades.length; i++) {
            double rango;
            rango = Math.pow(aiEdades[i]- iMedia, 2f);
            varianza = varianza + rango;
        }
        //IMPRIMIMOS LA DESVIACION
        iDesviacion = Math.sqrt(varianza);
        System.out.println("La desviacion estandar de las edades es: " + iDesviacion);
        }
    }
