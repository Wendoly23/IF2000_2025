/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import domain.Person;
/**
 *
 * @author Hp
 */
public class Account {
    
    public abstract class AccountC{
        
        //Atributes
        private String accountNumber;
        private double balance;
        private Person client;

        public AccountC(String accountNumber, double balance, Person client) {
         this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Person getClient() {
            return client;
        }

        public void setClient(Person client) {
            this.client = client;
        }
        
         //methods for polimorfism 
    
    public abstract void deposit();
    public abstract void withdraw();
    public abstract double interestCalculation();

    @Override
    public String toString() {
       
        String result= "\nBank Account INFORMATION"
                +"\n---------------------------------"
                + "\nAccount Number: "+ this.getAccountNumber()
                +"\nBalance: "+this.getBalance()
                +"\nAccount Owner: " +this.getClient().toString();
          return result;
    }//end class

         
        
    }
}
