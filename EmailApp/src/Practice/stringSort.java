package Practice;

import java.util.Scanner;

public class stringSort {
    public static void sortedArray() {
        int count;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to use: ");
        count = sc.nextInt();
        String st[] = new String[count];
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the names: ");
        for (int i = 0; i < count; i++) {
            st[i] = sc2.nextLine();
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (st[i].compareTo(st[j]) > 0) {
                    temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        System.out.println("Sorted order");
        for (int i = 0; i <= count - 1; i++) {
            System.out.print(st[i] + ", ");
        }
    }
}