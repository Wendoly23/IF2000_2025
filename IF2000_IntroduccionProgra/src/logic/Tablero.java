/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Hp
 */
public class Tablero {
    
private final Fichas[][] tablero;

public Tablero(){
    tablero = new Fichas[8][8];
    iniciarTablero();
}

private void iniciarTablero(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 8; j++) {
            if ((i+j)% 2!=0){
               tablero[i][j] = new Fichas("R"); 
            }
        }
    }
   
    for (int i = 5; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if((i+j)% 2!=0){
                tablero[i][j] = new Fichas("B");
            }
        }
    }
    
}

public void verTablero(){
    System.out.println(" 0 1 2 3 4 5 6 7");
     for (int i = 0; i < 8; i++) {
        System.out.print(i+" ");
         for (int j = 0; j < 8; j++) {
             if(tablero[i][j]==null){
                 System.out.print(". ");
             }else{
                 System.out.print(tablero[i][j]+" ");
             }
         }
      System.out.println();
    }      
}

public boolean movimientoFicha(int filaOrigen, int origenColumna, int filaDestinada, int columnaDestino, String turno){
    if(!interiorTablero(filaOrigen, origenColumna)|| !interiorTablero(filaDestinada, columnaDestino)){
        
        System.out.println("Movimiento");
        return false;
    }
   
    Fichas ficha = tablero[filaOrigen][origenColumna];
        if(ficha == null){
            System.out.println("No se encuentra ninguna ficha en el origen");
            return false;
        }
        
    if(!ficha.getColor().equals(turno)){
        System.out.println("Opcion invalida");
        return false;
    }     
        
    if(tablero[filaDestinada][columnaDestino]!=null){
        System.out.println("La casilla esta ocupada");
        return false;
    }
        
    int diferenteFila = filaDestinada - filaOrigen;
    int diferenteColum = Math.abs(columnaDestino - origenColumna); 
    
    if (diferenteColum != 1 || Math.abs(diferenteFila)!=1) {
        System.out.println("Solo se puede mover en diagonal");
        return false;
    }
   
    if (turno.equals("R")&& diferenteFila != +1) {
        System.out.println("Roja se mueve hacia abajo");
        return false;
    }
    
    if (turno.equals("B")&& diferenteFila != -1) {
        System.out.println("Negro se mueve hacia arriba");
        return false;
    }
    
    tablero[filaDestinada][columnaDestino] = ficha;
    tablero[filaOrigen][origenColumna] = null;
    return true;
}
    private boolean interiorTablero(int fila, int columna){
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
      
  }

}
