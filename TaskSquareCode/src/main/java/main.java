import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter message(without spaces): ");
            input = sc.nextLine();
            if (input.contains(" ") || input.isEmpty())
                System.out.println("Your message has spaces or is empty, enter message again.\n");
            if (input.length()>81)
                System.out.println("Your message has more than 81 characters. Enter a shorter message.\n");
        } while (input.length() > 81 || input.length() <= 0 || input.contains(" ") || input.isEmpty());

        String val = input.toLowerCase();
        List<String> listOfStrings = new ArrayList<String>();

        for (int i = 0; i < val.length(); i += ((int)sqrt(val.length())+1)) {
            String retVal;
            if (i + (int) sqrt(val.length() + 1) > val.length()) {
                retVal = val.substring(i);
                listOfStrings.add(retVal);
            } else {
                retVal = val.substring(i, i + ((int)sqrt(val.length())+1));
                listOfStrings.add(retVal);
            }
        }
        System.out.println("\n======================");
        System.out.println("Words written in a square line:\n");
        for (String s : listOfStrings) {
            System.out.println(s);
        }
        System.out.println("======================");
        List<String> retVal2 = new ArrayList<String>();

        for (int i = 0; i < listOfStrings.get(0).length(); i++) {
            String retVal3 = "";
            for (String s : listOfStrings) {
                if(s.length()>i)
                retVal3 = retVal3 + s.charAt(i);
            }
            retVal2.add(retVal3);
        }

        System.out.println("______________________");
        System.out.println("Coded message: \n");
        for (String s : retVal2) {
            System.out.print(s + "\t");
        }
        System.out.println("\n______________________");
    }
}
