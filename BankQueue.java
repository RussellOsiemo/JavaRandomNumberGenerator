package Russel;
import java.lang.Math;
public class BankQueue {
    public static void main (String[]args){
        //generating random numbers between 1 and 200
        int min = 1;
        int max = 200;
       double a = Math.random()*(max-min+1)+min;
        System.out.println("Card Number : "+a);
        //generating random numbers between 1 and 200
        System.out.println("<***********************************>");
        System.out.println("Welcome To National Bank, Tuko Nawe");
        int b = (int)(Math.random()*(max-min+1)+min);
        int c = (int)(Math.random()*(max-min+1)+min);
        int d = (int)(Math.random()*(max-min+1)+min);
        int e = (int)(Math.random()*(max-min+1)+min);
        int f = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Ticket number :"+b+" Please Proceed to counter number 1");
        System.out.println("Ticket number :"+c+" Please Proceed to counter number 2");
        System.out.println("Ticket number :"+d+" Please Proceed to counter number 3");
        System.out.println("Ticket number :"+e+" Please Proceed to counter number 4");
        System.out.println("Ticket number :"+f+" Please Proceed to counter number 5");
        System.out.println("<***********************************>");

    }
}
