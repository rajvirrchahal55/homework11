package Questions;

import java.util.ArrayList;
import java.util.Iterator;

/*4. Write a Java program to iterate through all elements in an array list using
Iterator.*/
public class Question4 {
    public static void main(String[]args){
        ArrayList<String>country=new ArrayList<>();
        country.add("india");
        country.add("usa");
        country.add("canada");
        country.add("england");
        for(String a:country){
            System.out.println(a);
        }
        Iterator it = country.iterator();
    }
}
