package pkg1.variable_labprogramacion;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Reyes_Oscar_Ejercicio2 {

    public static void main(String[] args) {
    //Diccionario de Datos
    double cuotaPago, pagarTotal, plazoPago, interesMensual, comisionCuota, porcentajeSeguroM, montoPrestamo;
    Scanner entradaDatos = new Scanner(System.in);
    
    //Entrada de Datos
    System.out.print("------ Calculo de Cuotas ------ \nIngrese los siguientes datos: \nMonto del Prestamo:");
        montoPrestamo = entradaDatos.nextDouble();
    System.out.print("Plazo de Cuota (En mes) : ");
        plazoPago = entradaDatos.nextDouble();
    System.out.print("Ingrese su interes mensual: ");
        interesMensual = entradaDatos.nextDouble();
    System.out.print("Ingrese comision de Cuota: ");
        comisionCuota = entradaDatos.nextDouble();    
    System.out.print("Ingrese Porcentaje de seguro mensual: ");
        porcentajeSeguroM = entradaDatos.nextDouble();     
    
    //Proceso o Calculo
        interesMensual = interesMensual / 100;
        porcentajeSeguroM = porcentajeSeguroM / 100;
    cuotaPago = (montoPrestamo * interesMensual)/ 1 - (Math.pow((1 + interesMensual), -plazoPago));
    cuotaPago = (cuotaPago) + (montoPrestamo * porcentajeSeguroM);
    cuotaPago = cuotaPago + comisionCuota;
            
    pagarTotal = cuotaPago * plazoPago;
    
    //Salida de Datos
    System.out.print("\n***CUOTAS MENSUALES*** \nCuota de pago mensual: HNL " + cuotaPago + "\n Total a pagar: HNL " + pagarTotal + "\n");
            
    }
    
}
