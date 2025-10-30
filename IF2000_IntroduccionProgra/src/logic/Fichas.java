/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Hp
 */
public class Fichas {
 
private final String color;

public Fichas(String color){
    this.color = color;
}
 
public String getColor(){
    return color;
}

@Override
public String toString(){
    return color;
}

}
