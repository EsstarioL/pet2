import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneFinder {
    static HashMap<String, ArrayList<String>> book = new HashMap();


    static {
        book.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        book.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        book.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
    }

    public static void main(String[] args) {
        int count = 1;
        String name="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите н, если захотите завершить поиск");
        System.out.println();
        while (name.equals("н") == false) {
            System.out.println("Введите ФИО(пример ввода Иванов И.И.): ");
            System.out.println();
            name = sc.nextLine();
            if (name.equals("н")) break;
            if (book.containsKey(name)) {
                ArrayList<String> phoneNumber = book.get(name);
                for (String number : phoneNumber) {
                    System.out.println(count + ") " + number);
                    count++;
                }
            }
            else {
                System.out.println("ФИО не найдены");
                System.out.println();
            }
        }
    }



}