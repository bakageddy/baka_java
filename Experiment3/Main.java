import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        DataInputStream in = new DataInputStream(System.in);
        String s, t;
        int choice, index;
        do {
            System.out.println("1. Append\t2. Insert\t3. Search\t4.Search using letter");
            System.out.println("5. Size\t6. Remove\t7. Sort\t8. Display\t9. Quit");
            System.out.println("Choice: ");
            choice = Integer.parseInt(in.readLine());

            if (choice == 1) {

                System.out.println("String: ");
                s = in.readLine();

                list.add(s);
            } else if (choice == 2) {

                System.out.println("String: ");
                s = in.readLine();

                System.out.println("Index: ");
                index = Integer.parseInt(in.readLine());

                list.add(index, s);

            } else if (choice == 3) {

                System.out.println("Search String: ");
                s = in.readLine();

                System.out.println(list.indexOf(s));

            } else if (choice == 4) {

                System.out.println("Character: ");
                s = in.readLine();

                for (String temp: list) {
                    if (temp.startsWith(s)) {
                        System.out.println(temp);
                    }
                }

            } else if (choice == 5) {

                System.out.println("Size: " + list.size());

            } else if (choice == 6) {

                System.out.println("String: ");
                s = in.readLine();

                list.remove(s);
            } else if (choice == 7) {

                Collections.sort(list);
                System.out.println(list);

            } else if (choice == 8) {

                System.out.println(list);

            } else {

                System.out.println("Wrong Input!");

            }
        } while (choice != 9);
    }
}
