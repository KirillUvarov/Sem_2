package Task_1;
//Напишите метод, который составит строку, состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
//


import java.io.FileWriter;
import java.io.IOException;


public class task_3 {
    private static String createString(String arg) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(arg).repeat(100));
        return sb.toString();
    }

    public static void write(String arg) throws IOException {
        String str = createString(arg);
        try ( FileWriter in = new FileWriter("test.txt")){
           in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
