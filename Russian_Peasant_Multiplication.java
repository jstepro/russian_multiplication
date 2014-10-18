/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russian_peasant_multiplication;
import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class Russian_Peasant_Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, result=0, isOdd = 0, flag = 0;
        Scanner in = new Scanner(System.in);
        
        //get 2 numbers from user
        System.out.println("enter the first number");
        num1 = in.nextInt();//num1 will be halfed
        
        System.out.println("enter the second number");
        num2 = in.nextInt();//num2 will be doubled
        
        //get the absolute value of both numbers and set a flag if one of them is negative
        if (num1 < 0){
            num1 = Math.abs(num1);
            flag++;
        }
        if (num2 < 0){
            num2 = Math.abs(num2);
            flag++;
        }
        
        while(num1 >= 1){
            isOdd = num1 % 2;
            if (isOdd != 0) //then then num1 is odd and we need to add num 2 to the result
                result = result + num2;
            
            num1 = num1/2; //half num1
            num2 = num2+num2; //double num2
        }
        
        if (flag == 1) //there was 1 negative input so the result should be negative
            result = 0 - result;
        
        System.out.println(result);
    }
}
