/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Hp
 */
public class QuizRegistroPersona {
       
   public void QuizRegistro(){
       Scanner sc = new Scanner(System.in);
       
       String nombre = leerNoVacio(sc, "Ingrese su nombre completo: ");
       String id = leerNoVacio(sc, "Ingrese su identificacion: ");
       int edad = leerEnteroPositivo(sc, "Ingrese su edad: ");
       String correo = leerEmailValido(sc, "Ingrese su correo electronico: ");
       String telefono = leerTelefonoValido(sc, "Ingrese su numero de telefono: ");
       
       LocalDateTime ohora = LocalDateTime.now();
       DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
       String fechaHora = ohora.format(formato);
       
       String linea = nombre + "|" + id + "|" + edad + "|" + correo + "|" + telefono + "|" + fechaHora;
       
       guardarLinea(linea);
       
       System.out.println("Registo guardado.txt");
       
       sc.close();    
   }

  public static String leerNoVacio(Scanner sc, String prompt){
      String input;
      do{
          System.out.print(prompt);
          input = sc.nextLine().trim();
          if (input.isEmpty()){
              System.out.println("Este espacio no puede estar vacio");             
          }
      }while(input.isEmpty());
      return input;      
  }  
    
  public static int leerEnteroPositivo(Scanner sc, String prompt){
    int edad = -1;
    while(edad<= 0){
        System.out.print(prompt);
        try{
            edad = Integer.parseInt(sc.nextLine());
            if (edad<=0){
                System.out.println("Debe ingresar un numero entero positivo");
            }
        }catch(NumberFormatException e){
            System.out.println("Ingrese un numero valido"); 
        }
    }
    return edad;           
  }
  
public static String leerEmailValido(Scanner sc, String prompt){
    String correo;
    do{
        System.out.print(prompt);
        correo = sc.nextLine().trim();
        if(!correo.contains("@")||correo.startsWith("@")||correo.endsWith("@")){
            System.out.println("El email debe tener '@' y ser valido");
            correo = "";
        }
    }while(correo.isEmpty());
    return correo;   
}

public static String leerTelefonoValido(Scanner sc, String prompt){
   String telefono;
   do{
       System.out.print(prompt);
       telefono = sc.nextLine().trim();
       if (!telefono.matches("\\d{8,}")) {
           System.out.println("El numero debe ser de ocho digitos");
           telefono = "";
       }
   }while(telefono.isEmpty());
   return telefono;      
}
 
public static void guardarLinea(String linea){
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("personas.txt", true))){
        bw.write(linea);
        bw.newLine();
    }catch(IOException e){
        System.out.println("Error al guardar el archivo: "+ e.getMessage());
    }
  }

}

