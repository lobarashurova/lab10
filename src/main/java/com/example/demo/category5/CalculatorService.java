package com.example.demo.category5;

public class CalculatorService {
    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        if(b!=0){
            return a/b;
        }else{
            System.out.println("division number cannot be zero");
            return 0;
        }

    }
    public int subtraction(int a, int b){
       return a-b;
    }
}
