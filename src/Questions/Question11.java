package Questions;

import java.util.ArrayList;

/*11. Declare global variables of your name, Add all your group names in list, using
        for each loop iterate and print ONLY your name.*/
public class Question11 {
   static String name1="rajvir";
   public static void main(String[]args){
    ArrayList<String> name=new ArrayList<>();
    name.add(name1);
    name.add("jwalant");
    name.add("kulwinder");
    name.add("vinay");
    name.add("preksha");
    name.add("sumit");
    for(String a:name){
        if(a.equalsIgnoreCase("rajvir")){
            System.out.println(a);
        }
    }
   }
   }
