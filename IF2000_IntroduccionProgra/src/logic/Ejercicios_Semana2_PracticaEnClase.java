/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Hp
 */
public class Ejercicios_Semana2_PracticaEnClase {
    

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void quiz2_A_primos(){
    }
    
    public void quiz2_B_piradime(int n){
        
        for (int i = 1; i <= n ; i++) {
            //controla los espacios vacios
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
                
            }
        
        for (int k = 1; k <=(2 * i - 1); k++) {
                    System.out.print("*");
                    
                    
                }
             System.out.println("");  
        }
             
    }
    
    
    
    public void ejercicioA(int n){
   
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || j == 0 || j == n -1){
                    System.out.print("*");
                }else{ System.out.print(" ");
                    
                }
            }
            
            System.out.println("");
            
        }
    }
    
    public void ejercicioB(int n){
     
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }     
    }
    
    public void ejercicioC(int n){
      
        for (int i = n; i >=1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }      
    }
    
    public void ejercicioD(){
        
        Scanner sc = new Scanner(System.in);
        
    int[] numeroEntero=new int[10];
    System.out.println("Ingerese 10 numeros enteros");
    
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero"+(i+1)+":");
            numeroEntero[i]=sc.nextInt();
        }
        
        Arrays.sort(numeroEntero);
        
     System.out.println("\nLos numeros enteros ingresados:");
    for (int n : numeroEntero) {
            System.out.print(n + " ");
    }
    System.out.println("");
  }   
    
    
    public void ejercicioE(){
    
        int[] numerosAleatorios=new int [100];
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
             numerosAleatorios[i] = random.nextInt(100) + 1;
        }
        
        Arrays.sort(numerosAleatorios);
        
        System.out.println("Arreglo ordenado descendente:");
        for (int i = numerosAleatorios.length - 1; i >= 0; i--) {
            System.out.print(numerosAleatorios[i] + " ");
            if ((numerosAleatorios.length - i) % 10 == 0) {
                System.out.println("");
            }
        }
            
        
        
    }
       
    public void ejercicioF(){
        
       char[][] tablero = new char[8][8];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) { 
                    tablero[i][j] = 'N';
                }
            }
        }
        
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    tablero[i][j] = 'R';
                }
            }
        }
        

        System.out.print("   ");
        for (int j = 1; j <= 8; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        
  
        for (int i = 0; i < 8; i++) {
            char fila = (char) ('A' + i);
            System.out.print(fila + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }      
    
    }