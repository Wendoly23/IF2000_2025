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
public class lab2_ejercicios {
    
    public lab2_ejercicios(){
        
    }
    
   public void sumadepares(int n){
       int suma = 0;
       for (int i = 2; i <= 1000; i+= 2) {
           suma += i;
       }
    
    System.out.print("La suma de los numero pares 2 y 1000 es de: " + suma);   
             
   } 
    
   public void conversiontem(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nIngrese la temperatura en grados celcius: ");
       double celsius = sc.nextDouble();
       
       double farenheit = (9.0/5.0)* celsius + 32;
       
       System.out.print("La temperatura en gardos farenheit es: "+farenheit);
       
   }
   
   public void calculopotencia(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nIngrese el nuemero entero X: ");
       int enteroX = sc.nextInt();
       
       System.out.print("Ingrese el numero entero N: ");
       int enteroN = sc.nextInt();
       
       int resultado = 1;
       
       for (int i = 1; i <= enteroN; i++) {
         resultado *= enteroX;  
       }
     System.out.println("El resultado de "+enteroX+"^"+enteroN+" es: "+resultado);
   }
   
   public void mesteclado(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese el numero de un mes(1 al 12): ");
       int numeroMes = sc.nextInt();
       
       String mes;
       
       switch(numeroMes){
           
           case 1: mes = "Enero";
           break;
           case 2: mes = "Febrero";
           break;
           case 3: mes = "Marzo";
           break;
           case 4: mes = "Abril";
           break;
           case 5: mes = "Mayo";
           break;
           case 6: mes = "Junio";
           break;
           case 7: mes = "Julio";
           break;
           case 8: mes = "Agosto";
           break;
           case 9: mes = "Septiembre";
           break;
           case 10: mes = "Octubre";
           break;
           case 11: mes = "Noviembre";
           break;
           case 12: mes = "Diciembre";
           break;
           default: mes = "El numero debe estar entre el 1 y 12. "
                   + "Intentelo otra vez.";
       }
       System.out.println("El mes corresponde a: "+mes);
   }
    
   public void resultadosevaluacion(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese un valor: ");
       int x = sc.nextInt();
       
       int resultados;
       
       if(x > 0){
           resultados = x + 5;
       }else if(x < 0){
       resultados = x * x;
       }else{
           resultados = 1;
       }
       
       System.out.println("El resultado de la funcion es: "+resultados);
   }
   
   public void areatriangulo(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese el lado A: ");
       double ladoA = sc.nextDouble();
       
       System.out.print("Ingrese el lado B: ");
       double ladoB = sc.nextDouble();
       
       System.out.print("Ingerse el lado C: ");
       double ladoC = sc.nextDouble();
       
       if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
           
           double perimetro = (ladoA+ladoB+ladoC)/2;
           
           double area = Math.sqrt(perimetro*(perimetro-ladoA)*(perimetro-ladoB)*(perimetro-ladoC));
           
           System.out.print("El area del triangulo es: "+area);
       }      
   }
   
   public void intercambiovalores(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nIngrese el valor de A: ");
       int variableA = sc.nextInt();
       
       System.out.print("Ingrese el valor de B: ");
       int variableB = sc.nextInt();
       
       System.out.println("\nValores antes del intercambio");
       System.out.println("A = "+variableA);
       System.out.println("B = "+variableB);
       
       int valortemp = variableA;
       variableA = variableB;
       variableB = valortemp;
       
       System.out.println("\nValores despues del intercambio");
       System.out.println("El nuevo valor de A: "+variableA);
       System.out.println("El nuevo valor de B: "+variableB);
   }
   
   public void encontrarecuacion(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese el valor de X0: ");
       double valorX0 = sc.nextDouble();
       
       System.out.print("Ingrese el valor de Y0: ");
       double valorY0 = sc.nextDouble();
       
       System.out.print("Ingrese le valor de X1: ");
       double valorX1 = sc.nextDouble();
       
       System.out.print("Ingrese el valor de Y1: ");
       double valorY1 = sc.nextDouble();
       
       if(valorX0 == valorX1){
           System.out.println("La pediente no esta definida. Es una recta vertical: X = "+valorX0);
       }else{
           
           double m = (valorY1 - valorY0)/(valorX1-valorX0);
           double b = valorY0 - m * valorX0;
           
           System.out.print("La ecuacion de la recta es: y = "+ m + b);
           
       }             
   }
           
  public void numeronatural(){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("\nIngrese un numero natural K:");
      int naturalK = sc.nextInt();
      
      if(naturalK <=0){
          System.out.println("El numero ingresado debe ser mayor a 0");
      }else{
          int suma = 0;
          for (int i = 1; i < naturalK; i++) {
              suma += i;
          }
          System.out.println("La suma de los numeros naturales menores a "+naturalK+" es: "+suma);
      }      
  } 
   
  public void promedionumeros(){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Ingrese los numeros que va a calcular: ");
      int cantidad = sc.nextInt();
      
      if(cantidad <= 0){
          System.out.println("La cantidad ingresada debe ser mayor a cero");
      }else{
          
          double suma = 0;
          int contador = 0;
          
          for (int i = 1; i <= cantidad; i++) {
              System.out.print("Ingrese el numero"+i+": ");
              double numero = sc.nextDouble();
              
              if(numero<0){
                  System.out.println("Solo puede ingresar numeros positivos.");
                  i--;
                  continue;
              }
              
             suma += numero;
             contador++;
          }      
        double promedio = suma / contador;
        System.out.println("La media de los "+contador+"numeros es: "+promedio); 
      }          
  }
  
  public void sumapares(){
      
      Scanner sc = new Scanner(System.in);
      
      int total= 0;
      int pares= 0;
      int impares= 0;
      int cantidadPar= 0;
      int cantidadImpar= 0;
      
      System.out.println("Ingrese 10 numeros enteros");
      
      for (int i = 1; i < 10; i++) {
      System.out.print("Numero"+i+": ");
      int numero = sc.nextInt();
      
      total += numero;
      
      if(numero%2==0){
          pares+=numero;
          cantidadPar++;
      }else{
          impares+=numero;
          cantidadImpar++;
      } 
     }
      System.out.println("\nResultados.");
      System.out.println("Suma total de los numeros: " + total);
      System.out.println("Cantidad de numeros pares: " + cantidadPar);
      System.out.println("Cantidad de numeros impares: " + cantidadImpar);
      System.out.println("Suma de los numeros pares: " + pares);
      System.out.println("Suma de los numeros impares: " + impares);     
  }
  
  public void calculo(){
      
    int sumaPares=0;
    int sumaImpares=0;
    
    for (int i = 1; i <= 200; i++) {
    if (i % 2 == 0) {
    sumaPares += i;
    }else{
    sumaImpares += i;
    }
   }
     System.out.println("Suma de numeros pares entre 1 y 200: " + sumaPares);
     System.out.println("Suma de numeros impares entre 1 y 200: " + sumaImpares);        
  }
  
  public void sumacuadrados(){
      
      int suma=0;
      
      for (int i = 1; i <= 100; i++) {
        suma += i*i;
      }
      
     System.out.println("La suma de los primeros 100 numeros naturales: "+suma);
        
  }
  
  public void calculofactorial(){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Ingrese un numero entero positivo: ");
      int numeroN = sc.nextInt();
      
      if(numeroN<0){
          System.out.println("El numero debe ser un entero positivo mayor o igual a 0.");
      }else{
          long factorial=1;
          
          for (int i = 2; i <= numeroN; i++) {
              factorial *=i;
          }
      System.out.println(numeroN+"! = "+factorial);
      }
    }
  
   public void valormaximo(){
       
       Scanner sc = new Scanner(System.in);
       
       int valor = Integer.MIN_VALUE;
       
       System.out.print("Ingrese 10 numeros: ");
       
       for (int i = 1; i <= 10; i++) {
           System.out.print("\nNumero"+i+": ");
           int numero = sc.nextInt();
           
           if(numero>valor){
               valor = numero;
           }               
       }
       System.out.println("\nEl valor maximo de los numeros ingresados es: "+valor);
       
   }  
}
