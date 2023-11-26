package Questions;

import java.util.ArrayList;

/*10. Write program and add all group members names in to array and iterates
        through for each loop and print your name.*/
public class Question10 {
public static void main(String[]args){
    ArrayList<String>name=new ArrayList<>();
    name.add("rajvir");
    name.add("jwalant");
    name.add("kulwinder");
    name.add("preksha");
    name.add("sumit");
    name.add("vinay");
    for(String a:name){
        if(a.equalsIgnoreCase("rajvir")){
        System.out.println(a);
    }
    }
}
}
