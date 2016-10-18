/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        verificarAngulo("1");
    }
     public static double solicitarDatos(String d){ //Solicita los valores
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static double verificarAngulo(String d){
        double a; //Variable
        do{ //Hacer que solicite datos y se guarden en a
         a = solicitarDatos(d);
        }while(a<0 || a>360);//Mientras que a sea menor que 0 o a sea mayor a 360
        return a;     
    }
}
