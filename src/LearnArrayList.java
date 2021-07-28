import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Harsh");

        System.out.println(names);

        names.add(1,"Cipher");
        System.out.println(names.get(1));

        names.remove(String.valueOf("Harsh"));
        System.out.println(names);


        for(String k: names) System.out.println(k);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(5);
        marks.add(6);



        Iterator<Integer> it = marks.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Note : All functions are for ArrayList and LinkedList


    }

}
