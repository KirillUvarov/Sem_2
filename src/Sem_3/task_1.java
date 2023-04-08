package Sem_3;

import java.util.*;

public class task_1 {
//    public static void main(String[] args) {
//    List list = new ArrayList();
//    list.add(1);
//    list.add("hell");
//    list.add(null);
//
//    System.out.println(list);
//}
//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 11));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
