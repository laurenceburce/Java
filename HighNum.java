import java.util.Scanner;

public class HighNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer x = scanner.nextInt();

        StringBuilder string;
        int y = 0;
        int temp;

        for (int a = 0; a < (int) (Math.log10(x) + 1); a++) {
            string = new StringBuilder(x.toString());
            temp = Integer.parseInt(string.deleteCharAt(a).toString());
            if (y < temp) {
                y = temp;
            }
        }
        System.out.println(y);
    }
}