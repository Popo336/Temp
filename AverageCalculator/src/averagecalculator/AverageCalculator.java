/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalculator ;

import java.util.Scanner ;

public class AverageCalculator {
    
    public static void main(String[] args) {
        int numOne, numTwo, numThree, numFour, numFive, numSix ;
        double total = 0.0 ;
        double average ;
        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Enter number 1 of 6: ") ;
        numOne = input.nextInt() ;
        total = total + numOne ;
        
        System.out.print("Enter number 2 of 6: ") ;
        numTwo = input.nextInt() ;
        total = total + numTwo;
        
        System.out.print("Enter number 3 of 6: ") ;
        numThree = input.nextInt() ;
        total = total + numThree ;
        
        System.out.print("Enter number 4 of 6: ") ;
        numFour = input.nextInt() ;
        total = total + numFour ;
        
        System.out.print("Enter number 5 of 6: ") ;
        numFive = input.nextInt() ;
        total = total + numFive ;
           
        System.out.print("Enter number 6 of 6: ") ;
        numSix = input.nextInt() ;
        total = total + numSix ;
        
        System.out.println("The total of these values equals: " + total) ;
        average = total / 6;
        
        System.out.println("The average of these values equals: " + average) ;
        
    }
    
}
