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
public class Guevara_Ernesto_Formulas {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        System.out.println("*** Ejercicios Matematicos ***");
        
        //Ejercicio a
        System.out.println("a) 3/2+4/3");
        System.out.println("Respuesta: 2.8");
        System.out.println("------------------------------------");
        
        //Ejercicio b
        System.out.println("b) 1/x-5 - 3xy/4");
        System.out.println("Ingrese el denominador 1 x: ");
        double x=lea.nextDouble();
        System.out.println("Ingrese el numerador 1 x: ");
        double x2=lea.nextDouble();
        double y=lea.nextDouble();
        double respuestaB=(1/x-5)-(3*x2*y/4);
        System.out.println("La espuesta es:"+respuestaB);
        System.out.println("------------------------------------");
        
        //Ejercicio  c
        System.out.println("c) 1/2+7");
        double respuestaC=1/2+7;
        System.out.println("La respuesta es: "+respuestaC);
        System.out.println("------------------------------------");
        
        //Ejercicio d
        System.out.println("d) 7+1/2");
        double respuestaD=7+1/2;
        System.out.println("La respuesta es: "+respuestaD);
        System.out.println("------------------------------------");
        
        //Ejercicio e
        System.out.println("e)((a*a)/(b-c))+((d-e)/(f-((g*h)/j)))");
        System.out.println("Ingrese el numerador 1 a: ");
        double a=lea.nextDouble();
        System.out.println("Ingrese el denominador 1 b: ");
        double b=lea.nextDouble();
        System.out.println("Ingrese el denominador 2 c: ");
        double c=lea.nextDouble();
        System.out.println("Ingrese el numerador 2 d: ");
        double d=lea.nextDouble();
        System.out.println("Ingrese el numerador 3 e: ");
        double e=lea.nextDouble();
        System.out.println("Ingrese el denonimador 3 f: ");
        double f=lea.nextDouble();
        System.out.println("Ingrese el numerador 4 g: ");
        double g=lea.nextDouble();
        System.out.println("Ingrese el numerador 5 h: ");
        double h=lea.nextDouble();
        System.out.println("Ingrese el denominador 4 j: ");
        double j=lea.nextDouble();
        double respuestaE=((a*a)/(b-c))+((d-e)/(f-((g*h)/j)));
        System.out.println("La respuesta es: "+respuestaE);
        System.out.println("------------------------------------");
        
        //Ejercicio f
        System.out.println("(m/n)+p");
        System.out.println("Ingrese el numerador 1 m: ");
        double m=lea.nextDouble();
        System.out.println("Ingrese el denominador 1 n: ");
        double n=lea.nextDouble();
        System.out.println("Ingrese el valor de p: ");
        double p=lea.nextDouble();
        double respuestaF=(m/n)+p;
        System.out.println("La repuesta es: "+respuestaF);
        System.out.println("------------------------------------");
        
        //Ejercicio g
        System.out.println("Ejercicio g");
        System.out.println("m+(n/(p-q))");
        System.out.println("Ingrese el valor de m: ");
        m=lea.nextDouble();
        System.out.println("Ingrese el numerador 1 n: ");
        n=lea.nextDouble();
        System.out.println("Ingrese el denominador 1 p: ");
        p=lea.nextDouble();
        System.out.println("Ingrese el denominador 2 q: ");
        double q=lea.nextDouble();
        double respuestaG=m+(n/(p-q));
        System.out.println("La respuesta es: "+respuestaG);
        System.out.println("------------------------------------");
        
        //Ejercicio h
        System.out.println("Ejercicio h");
        System.out.println("((a*a)/(b*b))+((c*c)/(d*d))");
        System.out.println("Ingrese el numerador 1 a: ");
        a=lea.nextDouble();
        System.out.println("Ingrese el denomindador 1 b: ");
        b=lea.nextDouble();
        System.out.println("Ingrese el numerador 2 c: ");
        c=lea.nextDouble();
        System.out.println("Ingrese el denominador 2 d: ");
        d=lea.nextDouble();
        double respuestaH=((a*a)/(b*b))+((c*c)/(d*d));
        System.out.println("La respuesta es: "+respuestaH);
        System.out.println("");
        System.out.println("------------------------------------");
        
        //Ejercicio i
        System.out.println("Ejercicio i");
        System.out.println("((m+(n/p))/(q-(r/s)))");
        System.out.println("Ingrese el valor de m");
        m=lea.nextDouble();
        System.out.println("Ingrese el valor de n");
        n=lea.nextDouble();
        System.out.println("Ingrese el valor de p");
        p=lea.nextDouble();
        System.out.println("Ingrese el valor de q");
        q=lea.nextDouble();
        System.out.println("Ingrese el valor de r");
        double r=lea.nextDouble();
        System.out.println("Ingrese el valor de s");
        double s=lea.nextDouble();
        double resultadoI = ((m+(n/p))/(q-(r/s)));
        System.out.println("La respuesta es: "+resultadoI);
        System.out.println("------------------------------------");
        
        //Ejercicio j
        System.out.println("Ejercicio j");
        System.out.println("((3*a)+b)/(c-((d+(5*e)/f+(g/(2*h)))))");
        System.out.println("Ingrese el valor de a");
        a=lea.nextDouble();
        System.out.println("Ingrese el valor de b");
        b=lea.nextDouble();
        System.out.println("Ingrese el valor de c");
        c=lea.nextDouble();
        System.out.println("Ingrese el valor de d");
        d=lea.nextDouble();
        System.out.println("Ingrese el valor de e");
        e=lea.nextDouble();
        System.out.println("Ingrese el valor de f");
        f=lea.nextDouble();
        System.out.println("Ingrese el valor de g");
        g=lea.nextDouble();
        System.out.println("Ingrese el valor de h");
        h=lea.nextDouble();
        double resultadoJ = ((3*a)+b)/(c-((d+(5*e)/f+(g/(2*h)))));
        System.out.println("El resultado es: "+resultadoJ);
        System.out.println("------------------------------------");
        
        //Ejercicio k
        System.out.println("Ejercicio k");
        System.out.println("((a+b)*(a+b)/(1/(x*x)+2))");
        System.out.println("Ingrese el valor de a");
        a=lea.nextDouble();
        System.out.println("Ingrese el valor de b");
        b=lea.nextDouble();
        System.out.println("Ingrese el valor de x");
        x=lea.nextDouble();
        double resultadoK = ((a+b)*(a+b)/(1/(x*x)+2));
        System.out.println("El resultado es: "+resultadoK);
        System.out.println("------------------------------------");
    }
}
