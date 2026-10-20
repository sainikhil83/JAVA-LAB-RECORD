import java.util.Scanner;

class binarysearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int first = 0;
        int last = n - 1;
        boolean found = false;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (a[mid] == x) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (a[mid] < x) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}