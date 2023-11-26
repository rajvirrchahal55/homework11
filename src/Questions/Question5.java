package Questions;

import java.util.ArrayList;

/*5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/
public class Question5 {
public static void main(String[]args){
    ArrayList<String>tubeName=new ArrayList<>();
    tubeName.add("Bakerloo");
    tubeName.add("Central");
    tubeName.add("circle");
    tubeName.add("city");
    if(tubeName.isEmpty()){
        System.out.println("ArreyList is empty");
    }
    else {
        System.out.println("ArreyList is not empty");
    }
}
}
