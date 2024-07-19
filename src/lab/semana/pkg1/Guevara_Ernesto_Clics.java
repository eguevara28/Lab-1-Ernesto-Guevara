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
public class Guevara_Ernesto_Clics {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de Clics Totales:");
        int ClicsTotales=lea.nextInt();
        System.out.println("Ingrese el primer grupo de clics: ");
        int Clics1=lea.nextInt();
        System.out.println("Cuantos pagaria por: "+Clics1+" clics");
        double PagoClics1=lea.nextDouble();
        System.out.println("Ingrese el segundo grupo de Clics: ");
        int Clics2=lea.nextInt();
        System.out.println("Cuantos pagaria por: "+Clics2+" clics");
        double PagoClics2=lea.nextDouble();
        System.out.println("Ingrese el tercer grupo de Clics: ");
        int Clics3=lea.nextInt();
        System.out.println("Cuantos pagaria por: "+Clics3+" clics");
        double PagoClics3=lea.nextDouble();
        double pagoClics=(Clics1*PagoClics1)+(Clics2*PagoClics2)+(Clics3*PagoClics3);
        double impuesto=pagoClics*0.16;
        double totalpago=pagoClics+impuesto;
        System.out.println("Clics totales: "+ClicsTotales);
        System.out.println("Impuestos: 16%");
        System.out.println("Total a pagar: "+totalpago);
    }
}
