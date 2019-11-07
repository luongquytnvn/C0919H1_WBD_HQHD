import java.util.Scanner;

public class lumpedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1, length2;
        do {
            System.out.println("Enter the number of elements in the array 1");
            length1 = scanner.nextInt();
        } while (length1 <= 0);
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Enter elements " + i);
            array1[i] = scanner.nextInt();
        }
        do {
            System.out.println("Enter the number of elements in the array 2");
            length2 = scanner.nextInt();
        } while (length2 <= 0);
        int[] array2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("Enter elements " + i);
            array2[i] = scanner.nextInt();
        }
        int length3 = length1 + length2;
        int[] array3 = new int[length3];
        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }
        for (int i = length1; i < length3; i++) {
            array3[i] = array2[i - length1];
        }
        for (int element : array3) {
            System.out.println(element);
        }

    }
}
