package Questions;

import java.util.ArrayList;
import java.util.Stack;

/*3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("pink");
        colors.add("red");
        colors.add("yellow");
        colors.add("purple");
        for (String a : colors) {
                System.out.println(a);
            }
        }
    }
