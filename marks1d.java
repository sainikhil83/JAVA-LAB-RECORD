import java.util.Scanner;
public class marks1d {
    public static void main(String[] args) {

        int[] marks = new int[6];
        String[] name = new String[6];

        Scanner S = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            name[i] = S.next();

            System.out.print("Enter Marks: ");
            marks[i] = S.nextInt();
        }

        System.out.println("\nStudents scoring 60 or above:");

        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }

        S.close();
    }
}