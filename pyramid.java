import java.util.Scanner;

class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();

        StringBuilder str = new StringBuilder();
        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < 2 * rows; y++)
            {
                // if(rows - x - 1 <= y && y <= rows + x - 1 )
                if(x + y >= rows - 1 && x+y < rows + 2 * x)
                {
                    str.append("*");
                }
                else   
                {
                    str.append(" ");
                }
                
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}