import java.util.Scanner;

public class IntExtractAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        int[] numArr = new int[(int) (Math.log10(num) + 1)];
        for (int x = 0; x < numArr.length; x++) {
            numArr[x] = (num % 10);
            num = num / 10;
        }

        int sum = 0;
        for (int x = numArr.length - 1; x >= 0; x--) {
            sum += numArr[x];
            System.out.print(numArr[x]);
            if (x == 0) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
        }
        System.out.println(sum);
    }
}