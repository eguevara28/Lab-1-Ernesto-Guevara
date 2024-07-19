/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.semana.pkg1;
import java.util.Scanner;
/**
 *
 * @author ernes
 */
public class LabSemana1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("*** Ingreso de Informacion del Empleado ***");
        System.out.println("Ingrese el Nombre del Empleado");
        String nombreEmpleado=lea.next();
        System.out.println("Ingrese las horas trabajadas");
        int horas=lea.nextInt();
        System.out.println("Ingrese la tarifa por hora del Empleado");
        double tarifaHora=lea.nextDouble();
        double salario=horas*tarifaHora;
        System.out.println("El salario semanal del empleado es de: "+salario);
    }
    
}
