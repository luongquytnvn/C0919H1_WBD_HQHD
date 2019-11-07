import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SIZE;
        do {
            System.out.println("Enter the number of elements in the array");
            SIZE = scanner.nextInt();
        } while (SIZE <= 0);
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter element " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}
