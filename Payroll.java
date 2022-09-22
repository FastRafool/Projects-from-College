/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikoro
 */
public class Payroll 
{
    public static void main(String[] args) 
    {
    int hours =40;
    short gym =500;
    // gym is the monthly gym stipend that we give employee's. I have added this hack so that the grosspay can include this calaculation.
    double grossPay, payRate = 25.0;
    /* "hours" stands for hours worked in a week*/
    grossPay = hours * payRate + gym;
    // gross pay is the total compensation of the employee
    System.out.println ("Your grossPay is \n$" + grossPay);
    }
}
