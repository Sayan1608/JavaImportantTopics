package hashmaps;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // will create a map of rollNo-studentName

        map.put(1,"Sayan"); // #1
        map.put(2,"Vipul");
        map.put(3,"Anuj");
        map.put(4,"Neha");
        map.put(1,"Subho"); // #1 is getting overidden here

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(30));

        String removed = map.remove(4);
        System.out.println("removed name : " + removed);

        boolean tina = map.remove(2, "Tina");
        System.out.println("Removed Tina ? " + tina);

        boolean subho = map.remove(1, "Subho");
        System.out.println("Removed Subho ? " + subho);
    }
}
