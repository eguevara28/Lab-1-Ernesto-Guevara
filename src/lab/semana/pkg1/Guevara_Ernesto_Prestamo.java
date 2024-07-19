/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.semana.pkg1;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class Guevara_Ernesto_Prestamo {
        public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("*** Cuota Banco ***");
        System.out.println("Ingrese el monto del prestamo");
        double prestamo=lea.nextDouble();
        System.out.println("Ingrese el plazo de meses establecido para el pago");
        int meses=lea.nextInt();
        System.out.println("El porcentaje de interes mensual: ");
        double interes=lea.nextInt()/100;
        double cuotabase=prestamo*interes;
        System.out.println("Ingrese la comision por cuota: ");
        double comisioncuota=lea.nextDouble();
        System.out.println("Ingrese el porcentaje del seguro mensual aplicado a la cuota: ");
        double seguromensual=lea.nextDouble()/100;
        double montoseguromensual=prestamo*seguromensual;
        double cuotamensualtotal=cuotabase+comisioncuota+montoseguromensual;
        double totalpago=cuotamensualtotal*meses;
        System.out.printf("*** Cuotas Mensuales ***\n");
        System.out.printf("Cuota de pago mensuales: %.2f",cuotamensualtotal,"\n");
        System.out.println("");
        System.out.printf("Pago total: %.2f",totalpago, "\n");
    }
}
