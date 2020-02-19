/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velas_cumple;

import java.util.Scanner;

/**
 *
 * @author Bryan WV
 */
public class Velas_cumple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte x=0,contador=0; //variables para digitar el numero de cumpleaños y para sumar las velas mas altas
    Scanner leer= new Scanner(System.in);
    System.out.println("Digite cuantos años tiene el/la cumpleañero/a");
    byte años=leer.nextByte();//variable tipo byte para no consumir mucha memoria
    byte altura_velas[]=new byte[años];
        System.out.println("Digite las alturas de las velas");
        for (int i=0;i<años;i++)//ciclo for para digitar las alturas de las velas en el vector altura_velas
        {
            altura_velas[i]=leer.nextByte();
            if (altura_velas[i]>x)//condicional para almacenar la altura de la vela mas grande
            {
              x=altura_velas[i];  
              
            }
        }
            for (int i=0;i<años;i++)/*ciclo for para que, despues de obtener la altura mas grande,
                se comienze a sumar la cantidad de velas de la misma magnitud*/
        {
            if (altura_velas[i]==x)//condicional para sumar la cantidad de las velas
            {
                contador++;
            }
        }
            System.out.println("El numero de velas apagadas son: "+contador);
        
    }
    
}
