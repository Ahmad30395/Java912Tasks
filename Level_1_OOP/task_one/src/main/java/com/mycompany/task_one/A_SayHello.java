/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_one;

import java.util.Scanner;
/**
 *
 * @author sd.Alsebaay
 */
public class A_SayHello {
   
        Scanner scanner = new Scanner(System.in);
        //System.out.print("");
        private String name;
        
        public void setName(){
            System.out.print("Enter name :     ");
            name = scanner.next();
        }
        public String getName(){
            return name;
        }
        
               
        

}
