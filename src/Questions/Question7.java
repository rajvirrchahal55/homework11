package Questions;

import java.util.HashMap;

/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
public class Question7 {
   public static void main(String[]args){
       HashMap<String,Integer>people=new HashMap<>();
       people.put("india",1000);
       people.put("usa",2000);
       people.put("canada",1500);
       people.put("england",1900);
       for(int a:people.values()){
           System.out.println(a);
       }
   }
}
