/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Hp
 */
public class Quiz_3 {
    
    public Quiz_3(){     
    }
        public void cuadradoasterisco(){
          
            int n = 8;
            
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || j == 0 || j == n -1){
                    System.out.print("* ");
                    
                }else if (i == n/2 && j == n/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
            
        }
            
            
            
                 
        }   
}       
        

