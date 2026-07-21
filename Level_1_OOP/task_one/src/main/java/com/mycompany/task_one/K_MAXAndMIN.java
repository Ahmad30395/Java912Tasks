/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_one;


/**
 *
 * @author sd.Alsebaay
 */
public class K_MAXAndMIN {
    
    private float num1, num2, num3;
    
    public void setNum1( float num1){
        this.num1 = num1;
    }
    public void setNum2(float num2){

        this.num2 = num2;
    }
    public void setNum3( float num3){
        this.num3 = num3;
    }
    
    public Float getNum1(){
        return num1;
    }
    public Float getNum2(){
        return num2;
    }
    public Float getNum3(){
        return num3;
    }
    
    public void printMaxAndMin( float num1 , float num2 , float num3){
        
        System.out.println(" Numbers  are :"  + num1 + num2 + num3);
        
        if( num1 >= num2  && num1 >= num3){  //num1  >
            if ( num2 >= num3 )
                System.out.println( num3 +" " + num1);
            System.out.println(num2 +" " + num1);
        
        }else if( num2 >= num1  && num2 >= num3){ // num2 >
            
            if ( num1 >= num3 )
                System.out.println( num3 +" " + num2);
            System.out.println(num1 +" " + num2);
        
        }else if( num3 >= num2  && num3 >= num1 ){  // num3 >
            
            if ( num2 >= num1 )
                System.out.println( num1 +" " + num3);
            System.out.println(num2 +" " + num3);
        
        }
        
        
        
    }
    
}
