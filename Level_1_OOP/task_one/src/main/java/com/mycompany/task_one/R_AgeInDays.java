/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_one;

/**
 *
 * @author sd.Alsebaay
 */
public class R_AgeInDays {
   

    private int nYears;
    private int nMonthes;
    private int nDays;

 
    public R_AgeInDays(int days){
        
        nYears = days/365;
        
        days %= 365;
        
        nMonthes = days/30  ;
        
        days = days % 30;
        
        nDays = days;
        
        System.out.println(nYears + " " + "years");
        System.out.println(nMonthes + " " + "months");
        System.out.println(nDays + " " + "days");
        
    
    }
    
}
