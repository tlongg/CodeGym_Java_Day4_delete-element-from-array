import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;

        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int x;
        System.out.println("Enter element to erase from array: ");
        x = scanner.nextInt();

        for (int j = x; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);

        System.out.println("Array after deletion at " + x + ":");
        for (int newValue : newArray){
            System.out.println(newValue + " ");
        }
    }
}