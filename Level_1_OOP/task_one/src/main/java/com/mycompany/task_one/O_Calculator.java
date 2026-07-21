/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_one;

/**
 *
 * @author sd.Alsebaay
 * 
 * Given a mathematical expression. The expression will be one of the following expressions: A+B
, A−B
, A∗B
 and A/B
.

Print the result of the mathematical expression.
 */

public class O_Calculator {
    
    int num1 , num2;
    char[] operators = {'+', '-', '*', '/'};
    
    char switchOp;
    
    int operatorIndex;
    

    
    public O_Calculator( String str){
        
        
        
        for (char op : operators) {
            operatorIndex = str.indexOf(op);
            
//            System.out.println("operator index  == "  + operatorIndex );
            if (operatorIndex != -1) {
                break;
            }
        }
        
        if (operatorIndex != -1) {
            String firstNumber = str.substring(0, operatorIndex);
            String operator = str.substring(operatorIndex, operatorIndex + 1);
            
            switchOp = operator.charAt(0);
            
            String secondNumber = str.substring(operatorIndex + 1);

//            System.out.println("First: " + firstNumber);
//            System.out.println("Operator: " + switchOp);
//            System.out.println("Second: " + secondNumber);
            
            num1 = Integer.parseInt(firstNumber);
            num2 = Integer.parseInt(secondNumber);
            
            
        } else {
            System.out.println("No operator found.");
        }
 
//        System.out.println("before switch case   +++++++++++  ");
        
        
        
        
         switch ( switchOp ){   
            case '+' -> System.out.println( num1+num2 );
            case '-' -> System.out.println( num1-num2 );
            case '*' -> System.out.println( num1*num2 );
            case '/' -> { 
                if ( num2 == 0){
                    System.out.println(" can not divide by 0 logical error !!! ");
                    break;
                }           
                System.out.println( num1/num2 );                }

            default -> System.out.println("Invalid grade.");
        }   
        
        
        
        
//
//        String firstNumber = input.substring(0, operatorIndex);
//        String operator = input.substring(operatorIndex, operatorIndex + 1);
//        String secondNumber = input.substring(operatorIndex + 1);


//            for( int i = 0; i <= st.length()-1 ; i++){
//                
//                
//                if ( st.indexOf('+') || st.indexOf('-') || 
//                        st.indexOf('*') || st.indexOf('/') ){
//
//                        ch = st.charAt(i);
//                        
//                        System.out.println(" ch =  " + ch);
//                        
//                        num1 = Integer.parseInt( st.substring(0, i-1) );
//                        num1 = Integer.parseInt( st.substring(i-1, st.length()-1) );
//                }
//            }
//            
//            System.out.println(" num1  = " + num1);
//            System.out.println(" char   = " + ch);
//            System.out.println(" num2  = " + num2);
//
//
//           
    
    }
    
    
    
}
