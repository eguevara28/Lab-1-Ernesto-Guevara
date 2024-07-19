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
public class Guevara_Ernesto_BoletaEmpleado {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("*** Ingreso de Informacion del Empleado ***");
        System.out.println("Ingrese el Nombre del Empleado");
        String nombreEmpleado=lea.next();
        System.out.println("Ingrese las horas trabajadas en el mes");
        int horas=lea.nextInt();
        int horasemanales=horas/4;
        System.out.println("Ingrese la tarifa por hora del Empleado");
        double tarifaHora=lea.nextDouble();
        double salario=horasemanales*tarifaHora;
        System.out.println("*** Boleta de Empleado ***");
        System.out.println("Nombre del Empleado: "+nombreEmpleado);
        System.out.println("Horas trabajadas mensuales: "+horas);
        System.out.println("Tarifa por hora: "+tarifaHora);
        System.out.println("El salario semanal: "+salario);
    }
    
}
