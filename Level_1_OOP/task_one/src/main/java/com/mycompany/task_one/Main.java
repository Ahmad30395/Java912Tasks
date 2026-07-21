/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_one;

import java.util.Scanner;

/**
 *
 * @author sd.Alsebaay
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// Problem one  A. Say Hello With C++


        A_SayHello A = new A_SayHello();
        String name;
        A.setName();
        name = A.getName();
        System.out.print("Hello, " + name + "\n");
      
////===============================================================
        System.out.println("finish problem one  \n");
////===============================================================
// Problem two No  K. Max and Min


        K_MAXAndMIN K = new K_MAXAndMIN();
        float n1, n2, n3;
        
        System.out.print(" Enter the 3 Numbers   : \n");
        
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        
        K.setNum1(n1);
        K.setNum2(n2);
        K.setNum3(n3);
  
       K.printMaxAndMin(K.getNum1(), K.getNum2(), K.getNum3());
        
////===============================================================
        System.out.println("finish problem two  \n");
////===============================================================
       
        
        
        System.out.println("Enter Expression like Num operator Num ( +  -  *  / ) ");
        
        String st = scanner.next();
        
        O_Calculator calc= new O_Calculator( st );
        
        
        
 ////===============================================================
        System.out.println("finish problem three  \n");
 ////===============================================================
        ///  problem four  : R. Age in Days

        System.out.print("Enter No. of Days :  ");
        int NofDays = scanner.nextInt();
        
        R_AgeInDays nDays = new R_AgeInDays(NofDays);
      
        
        
 ////===============================================================
        System.out.println("finish problem four  \n");
 ////===============================================================
        ///  problem four  : X. Two intervals

        X_TwoIntervals X = new X_TwoIntervals();

 ////===============================================================
        System.out.println("\n finish problem five ");
 ////===============================================================     
  
    double nZ1, nZ2, nZ3, nZ4;
    
    nZ1= scanner.nextInt();
    nZ2= scanner.nextInt();
    nZ3= scanner.nextInt();
    nZ4= scanner.nextInt();
    
    Z_HardCompare Z = new Z_HardCompare( nZ1 , nZ2  , nZ3  , nZ4 );
    
////===============================================================
        System.out.println("\n finish problem six ");
 ////=============================================================== 
    
 
        
        
      
    }
}
