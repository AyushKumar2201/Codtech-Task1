import java.util.*;
public class SimpleCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Choose an operation [ addition(+),substraction(-),multiplication(*),division(/) ] : ");
        char operator = sc.next().charAt(0);
        double result = 0;
        boolean validOperation = true;
        switch(operator){
            case '+' : result = num1+num2;
                       break;
            case '-' : result = num1-num2;
                       break;
            case '*' : result = num1*num2;
                       break;
            case '/' : if(num2!=0){
                       result = num1/num2;}
                       else{
                          System.out.println("Error : Division by zero is not allowed.");
                          validOperation = false;
                           }
                        break;
            default : System.out.println("Error: Invalid operation.");
                          validOperation = false;
                         break;
                        }
      if(validOperation==true){
       System.out.println("The result is :"+ result);
         }
          }
            }