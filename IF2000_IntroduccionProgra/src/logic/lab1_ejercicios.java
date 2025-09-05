/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Hp
 */
public class lab1_ejercicios {
    
    public lab1_ejercicios(){
       
    }
    
    public void ejercicio1(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero:");
        int entero = sc.nextInt();
        
        if(entero % 2 == 0){
            System.out.println("El numero "+ entero + " es par");
        }else{
            System.out.println("El numero " + entero + " es impar");
        }
        
    }
    
    public void ejercicio2(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero para determinar su valor: ");
        
        int numero = sc.nextInt();
        
        int valor;
        
        if(numero < 0){
            valor = -numero;
            
        }else{
            valor = numero;
        }
        
        System.out.println("El valor absoluto de "+ numero +" es: "+ valor);
        
    }
    
   public void ejercicio3(){
       
       int serieNumeros = 0;
       System.out.print("Serie de numeros:");
       
       for (int i = 3; i <= 99; i += 3) {
           if(i < 99){
               System.out.print(i + ", ");
               serieNumeros += i;
           }else{
          System.out.print(i);
          serieNumeros += i;
       }
   } 
       System.out.println("\nLa suma de los numeros es: " + serieNumeros);
   } 
   
   public void ejercicio4(){
       Scanner sc = new Scanner(System.in);
               
               System.out.print("Ingrese el primer numero:");
               int numero1 = sc.nextInt();
                   
               System.out.print("Ingrese el segundo numero:");
               int numero2 = sc.nextInt();
               
               System.out.print("Ingrese el tercer numero:");
               int numero3 = sc.nextInt();
               
               int[] numeros={numero1, numero2, numero3};
               
               Arrays.sort(numeros);
               System.out.println("El orden de los numeros es:");
               for(int n : numeros){
                   System.out.print(n+" ");
               }
   }
   
   public void ejercicio5(){
    
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nIngrese el primer numero:");
       double numeroM = sc.nextDouble();
       
       System.out.print("Ingrese el segundo numero:");
       double numeroN = sc.nextDouble();
       
       double resultado;
       String operacion;
       
       if(numeroM == numeroN){
           resultado = numeroM * numeroN;
           operacion = "Multiplicacion";
           
       }else if(numeroM > numeroN){
           resultado = numeroM - numeroN;
           operacion = "Resta";
       }else{
           resultado = numeroM + numeroN;
           operacion = "Suma";
       }
      System.out.println("El resultado de la "+ operacion +" es:"+resultado);
   }
   
   public void ejercicio6(){
       
       Scanner sc = new Scanner(System.in);
       
       boolean nota10 = false;
       int nota;
       int contador = 0;
       
       System.out.println("\nPrograma de registro de notas");
       System.out.println("Ingrese una nota entre 0 y 10(Finaliza con -1)");
       
       while(true){
           System.out.print("Ingrese la nota"+(contador + 1)+":");
           nota = sc.nextInt();
           
           if(nota == -1){
               break;
           }
        
           if(nota < 0 || nota > 10){
           System.out.print("La nota debe estar entre 0 y 10. Intentelo nuevamente");
           continue;
           }
           
           contador++;
           
           if(nota == 10){
               nota10=true;
           }          
       }
       System.out.print("Resultados");
       System.out.print("\nTotal de notas ingresadas: "+contador);
       
       if(nota10){
           System.out.println("\nSi hubo al menos una nota con valor de 10");
       }else{
           System.out.println("\nNo hubo ninguna nota con valor de 10");
       }
   }
   
   public void ejercicio7(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Calculadora de pulsaciones");
       
       System.out.print("Ingrese la edad: ");
       int edad = sc.nextInt();
       
       System.out.print("Ingrese el genero(F/M):");
       String genero = sc.next().toUpperCase();
       
       if(edad<= 0 || edad > 100){
           System.out.println("Edad no valida");
           return;
       }
       if(!genero.equals("F")&&!genero.equals("M")){
           System.out.println("Genero no valido.Utilice F o M");
           return;
       }
       
       double pulsaciones;
       if(genero.equals("F")){
           pulsaciones = (220 - edad)/10;
       }else{
           pulsaciones = (210 - edad)/10;
       }
       
        System.out.println("Resultados");
        System.out.printf("\nEdad: %d anos", edad);
        System.out.printf("\nGenero: %s", genero.equals("F") ? "Femenino" : "Masculino");
        System.out.printf("\nPulsaciones por 10 segundos: %.1f", pulsaciones);
        System.out.printf("\nPulsaciones por minuto: %.0f", pulsaciones * 6);
   }
   
   public void ejercicio8(){
       
       Scanner sc = new Scanner(System.in);
       
       try{
           System.out.print("\nIngrese el salario mensual: ");
           double salario = sc.nextDouble();
           
           System.out.print("Ingrese la cantidad de anos laborados: ");
           int laborados = sc.nextInt();
           
           int porcentaje;
           
           if(laborados<1){
               porcentaje = 5;
           }else if(laborados >= 1 && laborados < 2){
               porcentaje = 7;
           }else if(laborados >= 2 && laborados < 5){
               porcentaje = 10;
           }else if(laborados >= 5 && laborados < 10){
               porcentaje = 15;
           }else{
               porcentaje = 20;
           }
           
           double utilidad = salario * (porcentaje/100.0);
           
            System.out.println("\nRESULTADOS");
            System.out.println("Salario mensual: " + salario);
            System.out.println("Tiempo de labor: "+laborados+"anos");
            System.out.println("Porcentaje de utilidad: " + porcentaje + "%");
            System.out.println("Utilidad a recibir: "+utilidad);
           
       }catch (Exception e) {
            System.out.println("Error: Por favor ingrese valores numéricos válidos.");
        } finally {
       }
      }
   
   public void ejercicio9(){
    
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++; 
            }
        }

        if (contador == 2) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }      
   }
   
   public void ejercicio10(){
    
    Scanner sc = new Scanner(System.in);   
       
    final double precio = 11000;
    
    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
    int cantidad = sc.nextInt();
    
    double sinDescuento = cantidad * precio;
    double descuento = 0;
    
    if(cantidad < 5){
        descuento = sinDescuento * 0.10;
    }else if(cantidad >= 5 && cantidad < 10){
        descuento = sinDescuento * 0.20;
    }else if(cantidad >= 10){
        descuento = sinDescuento * 0.40;
    }
    
    double total = sinDescuento - descuento;
    
    System.out.println("Factura de la compra");
    System.out.println("Cantidad de computadoras: "+cantidad);
    System.out.println("Monto sin descuento: $"+sinDescuento);
    System.out.println("Monto del descuento: $"+descuento);
    System.out.println("Monto total a pagar: $"+total);
    
}
   
 public void ejercicio11(){
     
     Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero natural N: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("No hay primos menores a 2.");
            return;
        }

        System.out.println("Numeros primos entre 2 y " + n + ":");

        for (int numero = 2; numero <= n; numero++) {
            int contador = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();     
 }  
 
 public void ejercicio12(){
    
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Calcular area de un triangulo");
     
     System.out.print("Ingrese la base: ");
     double base = sc.nextDouble();
     
     System.out.print("Ingrese la altura: ");
     double altura = sc.nextDouble();
     
     if(base > 0 && altura >0){
         double area = (base * altura)/2;
         System.out.print("El area es: "+area);
     }    
}
 
}
