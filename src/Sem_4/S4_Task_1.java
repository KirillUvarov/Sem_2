//package Sem_4;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text:num
// Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
// Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
//
// */
//public class S4_Task_1 {
//    private static List<String> dataBase = new LinkedList<>();
//    private static final String SEPARATOR = ";";
//    public static void main(String[] args) {
//        while (true){
//
//        }
//        saveToDB(input);
////        System.out.println(dataBase.toString());
//    }
//    private void saveToDB(String input){
//        System.out.println("Введите строку вида text:num");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        String data = input.split(SEPARATOR)[0];
//        int index = Integer.parseInt(input.split(SEPARATOR)[1]);
//        else{
//            if (index > dataBase.size()){
//                for (int i = 0; i < index; i++) {
//                    dataBase.add(null);
//                }
//
//            }
//            else {
//                if (! data.toLowerCase().startsWith("print")){
//                    System.out.println(dataBase.get(index));
//                }
//            }
//        }
//    }
//}
