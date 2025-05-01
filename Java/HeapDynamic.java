import java.util.ArrayList;
import java.util.Scanner;

public class HeapDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr.add(sc.nextInt());
        }

        System.out.print("Heap Dynamic Array list are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
