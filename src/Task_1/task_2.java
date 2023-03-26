package Task_1;

//Напишите метод, который сжимает строку.
//Пример: aaaabbbcdd → a4b3cd2//

public class task_2 {
    //    public static String stringCompression(String arg){
//        int count = 1;
//        String[] arr = arg.split("");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0){
//                result.append(arr[i]);
//                continue;
//            }
//            if (arr[i - 1].equals(arr[i])){  //Сравнение именно строк, а не ==
//                count++;
//            }
//            else {
//                result.append(count);
//                count = 0;
//                result.append(arr[i]);
//            }
//        }
//        if (count != 1) result.append(count);
//        return result.toString();
//    }
    public static String stringCompression(String argument) {
        int count = 1;
        String[] arr = argument.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.append(arr[i]);
                continue;
            }
            if (arr[i].equals(arr[i - 1])) {
                count++;
            } else if (count != 1) {
                result.append(count);
                count = 1;
                result.append(arr[i]);
            } else {
//                count = 1;
                result.append(arr[i]);
            }
        }
        if (count != 1) result.append(count);
        return result.toString();


    }
}
