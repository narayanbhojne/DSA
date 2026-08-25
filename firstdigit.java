import java.util.Scanner;

public class firstdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        int first;

        if (d == 0) {
            first = 10;
        } else {
            first = d;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + first;
            first = first + 10;
        }

        System.out.println(sum);
    }
}