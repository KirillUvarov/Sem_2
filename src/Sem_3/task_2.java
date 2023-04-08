package Sem_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Pluto");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Pluto");

//    Map<String, String> dictionary = new HashMap<String, String>(); //Создаём хэш-таблицу
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < planets.size(); i++) {
            if (!res.contains(planets.get(i))){
                res.add(planets.get(i));
                int count = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if(planets.get(j).equals(planets.get(i))) count ++;

                }
                sb.append(planets.get(i)).append(":").append(count).append("\n");
            }
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
