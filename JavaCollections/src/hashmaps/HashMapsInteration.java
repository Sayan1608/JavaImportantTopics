package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapsInteration {
    public static void main(String[] args) {
        Map<String,Integer> studentMarks = new HashMap<>();

        studentMarks.put("Sayan",95);
        studentMarks.put("Rahul",92);
        studentMarks.put("Neha",97);
        studentMarks.put("Koushik",98);
        studentMarks.put("Smita",90);

        Set<String> names = studentMarks.keySet();
        for (String name : names){
            System.out.println(studentMarks.get(name));
        }

        System.out.println("#########################################");

        Set<Map.Entry<String, Integer>> entries = studentMarks.entrySet();
        for(Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + " : " + entry.getValue());

    }
}
