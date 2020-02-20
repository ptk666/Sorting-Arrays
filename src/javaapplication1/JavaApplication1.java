/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author STI College Shaw
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[10];
        int b[] = new int[10];
        int temp = 0;
        String choice;
        String choice2;
        
        Scanner s = new Scanner(System.in);
        
        boolean restart = true;
        while(restart){
        System.out.println("Enter 10 integers: ");
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(i+1 + " => ");
            a[i] = s.nextInt();
            b[i] = a[i];
        }
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Select an option to sort: \nA - Ascending\nD - Descending");
        choice = s.next();
        
        if(choice.equalsIgnoreCase("A"))
        {            
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++)
        {            
            System.out.print(a[i] + ", ");
        }
        }
        else if(choice.equalsIgnoreCase("D"))
        {
            for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
            for(int i = 0; i < a.length; i++)
        {            
            System.out.print(a[i] + ", ");
        }
        }
        System.out.println();
        
                System.out.println("Type yes to play again, no to exit.");
                choice2 = s.next();
                s.nextLine();
                if(choice2.trim().toLowerCase().equals("yes"))
                {
                    restart = true;
                } 
                else
                {
                    restart = false;
                }
                    
                
    }
   }
    
}
