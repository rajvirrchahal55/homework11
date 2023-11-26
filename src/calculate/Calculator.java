package calculate;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }
    public void division(int a,int b){
        System.out.println(a/b);
    }
    public void calculateResult(int a, int b,char c) {
        if (c == '+') {
            System.out.println(a + b);
        }
        if (c == '-') {
            System.out.println(a - b);
        }
        if (c == '/') {
            System.out.println(a / b);
        }
        if (c == '*') {
            System.out.println(a * b);
        }
    }
        public static void main(String [] args){
            Calculator obj = new Calculator();
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter first number: ");
                 int a = sc.nextInt();
                System.out.println("Enter second number: ");
                int b = sc.nextInt();
                System.out.println("Please enter one of symbol +,-,*,/: ");
                char symbol = sc.next().charAt(0);
                obj.calculateResult(a, b, symbol);
                System.out.println("Would you like to do more calculation Please enter Y or N : ");
                String input = sc.next();

            }
        }

