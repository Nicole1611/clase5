package com.mycompany.clase5;

import java.util.Scanner;
public class Clase5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] notas = new int [50];
        int contRegular=0;
        int contBueno=0;
        int contExcelente=0;
        /*numeros [0]=10;
        numeros [1]=3;
        numeros [2]=5;
        numeros [3]=8;
        numeros [4]=7;*/
        System.out.println("Ingresa las notas de los estudiamtes");
        for (int i = 0; i < 10; i++) {
            do {                
                notas [i]=sc.nextInt();
            } while ((notas[i]<0)||(notas[i]>10));
                
        }
        
        for (int i = 0; i < 10; i++) {
            if ((notas[i]>=0)&&(notas[i]<=6)) {
                contRegular++;
            }
            else{  
            if ((notas[i]>=7)&&(notas[i]<=8)) {
                    contBueno++;
                }
                else{
                     if ((notas[i]>8)&&(notas[i]<=10)) {
                    contExcelente++;}
                }
            }
        }
        System.out.println("Existen "+contRegular+" estudiante con una calificacion Regular ");
        System.out.println("Existen "+contBueno+" estudiante con una calificacion Bueno ");
        System.out.println("Existen "+contExcelente+" estudiante con una calificacion Excelente ");
    }
}
