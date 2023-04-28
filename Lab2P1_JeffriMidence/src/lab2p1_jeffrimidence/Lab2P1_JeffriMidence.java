/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_jeffrimidence;

import java.util.Scanner;

/**
 *
 * @author sabdi
 */
public class Lab2P1_JeffriMidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
            int resp = 3;
            while(resp != 5) {//inicio del while prin
               System.out.println("1. Clasificando");
               System.out.println("2. Aproximado");
               System.out.println("3. MCD");
               int opcion= sc.nextInt();
               
               switch (opcion) {//Aqui inicia el switch 
                   case 1:
                       System.out.println("Ingrese el numero que decea evaluar: ");
                       int evaluar= sc.nextInt();
                       int contador_par=0;
                       int contador_impa=0;
                       int contador_primo=0;
                       while (evaluar>0) {//inicio del while
                           System.out.println("Ingrese su numero otra ves por favor: ");
                           evaluar = sc.nextInt();
                           if(evaluar % 2 ==0){//inicio del if
                               contador_par++;
                               System.out.println("Su numero es par");
                           }//fin del if 
                           else {// inicio del else
                               contador_impa++;
                               System.out.println("Su numero es impar");
                           }//fin del else 
                           
                       }// fin del while
                       
                       break;
                   case 2:
                       System.out.println("Ingrese la precision del calculo: ");
                       int cal= sc.nextInt();
                       int contador_i=1;
                       double resultado=1;
                       while(contador_i<=cal){//inicio del while
                           double potencia= Math.pow((double)contador_i,(double)2);
                           double fraccion_1= 4*potencia;
                           double fraccion_2=fraccion_1-1;
                           resultado=(fraccion_1/fraccion_2)*resultado;
                           contador_i++;
                       }//fin del while
                       resultado*=2;
                       System.out.println("pi: "+resultado);
                               
                   break;
                   case 3:
                       System.out.println("Ingrese su primer numero: ");
                       int A=sc.nextInt();
                       int A1=A;
                       System.out.println("Ingrese un numero menor que el primero: ");
                       int b=sc.nextInt();
                       int b1=b;
                       int c=0;
                       int contador=0;
                       while (A !=b){//inicio del while
                            if (A>b){//inicio del if
                                A=A-b;
                            }//fin del if
                            else {//inicio del else
                                b=b-A;
                            }//fin del else
                            contador++;
                       }//fin del while
                       System.out.println("El MCD de "+A1+" y "+b1+" es "+A);
                       break;
               }//fin del switch
            }// fin del while prin
    }//fin del main
    
}// fin del programa
