import java.util.Scanner;
public class evenoddswitchcase2b {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("THIS NUMBER IS EVEN");
                break;
            case 1:
                System.out.println("THIS NUMBER IS ODD");
                break;
        }
        s.close();
    }
}