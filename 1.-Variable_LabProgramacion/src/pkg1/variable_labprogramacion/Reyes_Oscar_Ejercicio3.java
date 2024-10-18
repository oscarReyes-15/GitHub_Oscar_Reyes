/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.variable_labprogramacion;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Reyes_Oscar_Ejercicio3 {
    
        public static void main(String[] args) {
        //Diccionario de Variables 
        double costoClic, Clics, costoPromedio, inputDummy;
        Scanner entradaDatos = new Scanner(System.in);
        
        //Entrada de Datos
        System.out.print("****Calculando costos de clicks**** \nIngrese la cantidad de clics: ");
        Clics = entradaDatos.nextDouble();
        
        //Proceso
            //Validacion de Precio
            if (Clics > 0 || Clics <21 ){ costoClic = 0.80;}
            else {if (Clics > 20 || Clics < 61){ costoClic = 0.30;} 
            else {if (Clics > 60){costoClic = 0.25;} 
            else {costoClic = 0;}}}
            
            //Calculo de Precio
            costoPromedio = (Clics * costoClic);
            inputDummy = costoPromedio * 0.16;
            costoPromedio = inputDummy + costoPromedio;
        
        //Salida de Datos
        String costoPromedioForm = String.format("%.2f", costoPromedio);
        System.out.print("El costo promedio de sus click son: " + costoPromedioForm + "\nCantidad de clics: " + Clics + "\n");
        
        
        }
    
}
