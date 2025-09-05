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
public class Quiz_4 {

  public Quiz_4(){  
  }  

  public void Datos(){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Ingrese sus datos");
      
      System.out.print("Ingrese su nombre completo: ");
       String nombre = sc.nextLine();
      
      System.out.print("Ingrese su edad: ");
      int edad = sc.nextInt();
      
      System.out.println("MUCHAS GRACIAS.");
  }
}
