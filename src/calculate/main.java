package calculate;

import java.util.Scanner;

/*Create one package with name calculate
2. Create two class with name “Calculator” and “Main”*/
public class main extends Calculator{
   public static void main(String[]args){
           main obj=new main();
           Scanner sc = new Scanner(System.in);
       calculator();
       System.out.println("Would you like to do more calculation Please enter Y or N : ");
       String input = sc.next();
            while(input.equalsIgnoreCase("y")) {
                calculator();
                System.out.println("Would you like to do more calculation Please enter Y or N : ");
                input = sc.next();

            }if(input.equals("n")|| input.equals("N"))  {
                System.out.println("Thank you ");
            }
   }

    private static void calculator() { System.out.println("Enter first number: ");
        main obj=new main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter one of symbol +,-,*,/: ");
        char symbol = sc.next().charAt(0);
        obj.calculateResult(a, b, symbol);

    }
}

