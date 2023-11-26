package Questions;

import java.util.ArrayList;

/*Write program and add all group names in to array and iterates through for
        each loop.*/
public class Question9 {
    public static void main(String[]args){
        ArrayList<String>name=new ArrayList<>();
        name.add("rajvir");
        name.add("jwalant");
        name.add("kulwinder");
        name.add("preksha");
        name.add("sumit");
        name.add("vinay");
        for(String a:name) {
            System.out.println(a);
        }
    }
}
