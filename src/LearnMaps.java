import java.util.HashMap;
import java.util.Map;

public class LearnMaps {
    public static void main(String[] args) {

        // HashMap
        Map<Integer,String> student = new HashMap<>();

        student.put(3,"Cipher");
        student.put(33,"Harsh");
        student.put(33,"Harsh");
        student.put(35,"Harshyy");
        student.put(34,"Harshuu");
        student.put(123,"yogii");
        System.out.println(student);


        // Map iterations
        for(Map.Entry<Integer, String> e: student.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        System.out.println(student.containsValue("Harsh"));
        System.out.println(student.containsKey(69));
        student.remove(3);
        System.out.println(student);


        // TreeMap
        // Similar to HashMap but here it enters keys in SORTED order. Therefore here insertion becomes time costily to O(log(n))

    }
}
