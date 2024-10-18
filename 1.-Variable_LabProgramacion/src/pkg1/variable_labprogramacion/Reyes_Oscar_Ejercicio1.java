/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.variable_labprogramacion;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Reyes_Oscar_Ejercicio1 {

    public static void main(String[] args) {
        //Diccionario de Variables
        float horasLabor, tarifaHora, salarioSemanal, horaSemanal;
        String Nombre;
        Scanner entradaDatos = new Scanner(System.in).useDelimiter("\n");
        
        //Entrada de Datos
        System.out.print("-----Planilla de Empleado----- \nPara calcular su salario semanal ingrese los siguientes datos \nNombre completo: \n");
        Nombre = entradaDatos.next();
        System.out.print("Ingrese sus horas laboradas durante el mes: \n");
        horasLabor = entradaDatos.nextFloat();
        System.out.print("Ingrese su tarifa por hora: \n");
        tarifaHora = entradaDatos.nextFloat();
        
        //Proceso de Datos
        horaSemanal = horasLabor /4;
        salarioSemanal = tarifaHora * horaSemanal;
        
        //Salida de Datos
        System.out.print("----- Boleta del Empleado ----- \nNombre del empleado: " + Nombre +
                "\nHora de Trabajo mensual: " + horasLabor + 
                "\nTarifa por Hora: Lps." + tarifaHora + 
                "\nSalario del empleado Semanal: Lps." + salarioSemanal + "\n  ");
    }
    
}
