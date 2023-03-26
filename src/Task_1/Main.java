//import Task_1.task_1;
//
//import java.io.File;
//import java.io.IOException;
//
//import static Task_1.task_1.forExample;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        forExample();
//    }
//
//    private static void forExample() {
//        try {
//            File file = new File("/test.txt");
//            file.createNewFile();
//            throw new Exception("ERROR");
//        } catch (Exception e){
//            throw new RuntimeException(e);
//        }
//        finally {
//            System.out.println("А я всё равно работаю");
//        }
//
//    }
//}

package Task_1;

import Task_1.task_1;
import Task_1.task_2;
import Task_1.task_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%s", task_1.getRepeatString(5));
        System.out.println(task_2.stringCompression("aaaabbbcdd"));

        try {
            task_3.write("TEST" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}