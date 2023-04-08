package Sem_5.Task_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_0 {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(123456,"Иванов");
        map1.put(321456,"Васильев");
        map1.put(234432, "Иванов");
        map1.put(654321, "Петрова");
        map1.put(345678, "Иванов");

        System.out.println(map1);

        //for (var item : map1.entrySet()) {
            //System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        //}
        for(Map.Entry<Integer, String> entry : map1.entrySet()) {
            if(entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }
    }
}







