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
        calcularAngulo();
    }
    
    public static void calcularAngulo(){ //Calcula cada una de las funciones
        switch(menu()){ //Entra la opcion elegida en el metodo pasado
            case 1:
                seno();
                break;
            case 2:
                coseno();
                break;
            case 3:
                tangente();
                break;
            case 4:
                funcionesT();
                break;
            }
    }
    public static int menu(){ //Creacion de un menu para dar al usuario a elegir la opcion deseada
        int opcion;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.print("Introduce la opcion deseada:" + "\n");
            System.out.print("1. Seno" + "\n");
            System.out.print("2. Coseno" + "\n");
            System.out.print("3. Tangente" + "\n");
            System.out.print("4. Todas" + "\n");
            opcion=teclado.nextInt();
        }while (opcion <=0 || opcion >4); //Mostrar el menu mientras que la opcion elegida sea menor o igual que 0 o mayor que 4
        return opcion;
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
    public static void seno(){
        double a = verificarAngulo("angulo del cual se quiere obtener seno ");
        a=Math.toRadians(a);
        System.out.print("El seno es: " + Math.sin(a));
    }
    public static void coseno(){
        double a = verificarAngulo("angulo del cual se quiere obtener coseno ");
        a=Math.toRadians(a);
        System.out.print("El coseno es: " + Math.cos(a));
    }
    public static void tangente(){
        double a = verificarAngulo("angulo del cual se quiere obtener tangente ");
        a=Math.toRadians(a);
        System.out.print("La tangente es: " + Math.tan(a));
    }
    public static void funcionesT(){
        double a = verificarAngulo("angulo del cual se quiere obtener seno, coseno y tangente ");
        a = Math.toRadians(a);
        System.out.print("El seno es " + Math.sin(a) + "\n");
        System.out.print("El coseno es " + Math.cos(a) + "\n");
        System.out.print("La tangente es " + Math.tan(a));
    }
    
}
