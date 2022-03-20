package com.company;

import java.io.InvalidClassException;
import java.util.Scanner;

public class Calculator {

    public void calculate() throws InvalidClassException {
        Scanner sc = new Scanner(System.in);
        //operator, and two number
        System.out.println("Choose an Operator  + - * / ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter first Number");
        Double num1 = sc.nextDouble();
        System.out.println("Enter Second Number");
        Double num2 = sc.nextDouble();
        double result = 0.0;
        switch (operator){
            case '+' :{
                result = num1 + num2;
                break;
            }
            case '-':
                result = num1 - num2;
                break;
            case '*': result = num1 * num2;
            break;

            case '/': {
                result = num1/num2;
                break;
            }
            default: System.out.println("Please enter a valid operator + - * /");
                throw new InvalidClassException("Please enter a valid operator + - * /");

        }
        System.out.println(num1 + " " + operator +  " " + num2 + " = "  + result);
    }

    public static void main(String[] args) throws InvalidClassException {
        Scanner sc = new Scanner(System.in);
        //operator, and two number
        System.out.println("Choose an Operator  + - * /");
        char operator = sc.next().charAt(0);
        System.out.println("Enter first Number");
        Double num1 = sc.nextDouble();
        System.out.println("Enter Second Number");
        Double num2 = sc.nextDouble();
        Double result = 0.0;
        if(operator == '+'){
            result = num1 + num2;
        }else if(operator == '-'){
            result = num1 - num2;
        }else if(operator == '*'){
            result = num1 * num2;
        }else if(operator == '/'){
            result = num1/num2;
        }else {
            System.out.println("Please enter a valid operator + - * /");
            throw new InvalidClassException("Please enter a valid operator + - * /");
        }
//        5 + 5 = 10
        System.out.println(num1 + " " + operator +  " " + num2 + " = "  + result);

    }
}
