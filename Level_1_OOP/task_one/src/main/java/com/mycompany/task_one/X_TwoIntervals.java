package com.mycompany.task_one;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sd.Alsebaay
 */
public class X_TwoIntervals {
    
    int num11, num22, num33, num44, start , end;
    Scanner scanner = new Scanner(System.in);

    public X_TwoIntervals() {
        
        
        
        
        num11 = scanner.nextInt();
        num22 = scanner.nextInt();
        num33 = scanner.nextInt();
        num44 = scanner.nextInt();
        
        if( num11 < num33 && num22 < num33|| num11 > num44 && num22 >num44 ){
            System.out.print(-1);
        }else{
            if( num11 < num33 ){
                start = num33;
            }else{
                start = num11;
            }
            if( num22 < num44 ){
                end = num22;
            }else{
                end = num44;
            }
            System.out.print(start +" " + end);
        }
        
    }
        
    ////////////////////// Best Code ////////////////////////////
    ///  for case 10 50 60 20     
//        if ( l1 <= r1){      
//            } else{
//            long swap2;
//            swap2 = l1;
//            l1 = r1;
//            r1 = swap2;
//        }        
//        if ( l2 <= r2 ){   
//            }else{
//                long swap;
//                swap = l2;
//                l2 = r2;
//                r2 = swap; 
//            } 
    ///
    ///    
//        long l1 = scanner.nextLong();
//        long r1 = scanner.nextLong();
//        long l2 = scanner.nextLong();
//        long r2 = scanner.nextLong();
//
//        long left = Math.max(l1, l2);
//        long right = Math.min(r1, r2);
//
//        if (left <= right) {
//            System.out.println(left + " " + right);
//        } else {
//            System.out.println(-1);
//        }  
        
        
        
}
