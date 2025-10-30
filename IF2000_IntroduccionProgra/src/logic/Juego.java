/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Juego {
    
    private Tablero tablero;
    private String turno;
    private Scanner sc;
    
    public Juego(){
      tablero = new Tablero();
      turno = "R";  
      sc = new Scanner(System.in);
    }
    
    public void iniciarJuego(){
        boolean continuar = true;
        
       while(continuar){
          System.out.println("\nTurno de "+(turno.equals("R")? "Rojas" : "Negras"));
           tablero.verTablero();
           
           System.out.print("Fila actual: ");
           int filaO = sc.nextInt();
           System.out.print("Columna actual: ");
           int columnaO = sc.nextInt();
           System.out.print("Fila de destino: ");
           int filaD = sc.nextInt();
           System.out.print("Columna de destino: ");
           int columnaD = sc.nextInt();
           
           boolean movimiento= tablero.movimientoFicha(filaO, columnaO, filaD, columnaD, turno);
           if (movimiento){
               cambioTurno();
           }    
       }        
    }
    
    private void cambioTurno(){
        turno = turno.equals("R")?"B":"R";
    }
    public static void main(String args[]){
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
}
