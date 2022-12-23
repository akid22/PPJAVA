
import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args){
        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        int[] reformed = eliminateDuplicates(array);
        for (int i = 0; i < reformed.length; i++) {
            System.out.println("No duplicates: " + reformed[i]);
        }

    }

    public static int[] eliminateDuplicates(int[] list){
        int[] arr = Arrays.stream(list).distinct().toArray();
        return arr;
    }
}
