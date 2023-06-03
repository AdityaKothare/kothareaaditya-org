import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Number of Star");
        Scanner sc = new Scanner(System.in);
        int no =sc.nextInt();
//        print Star Patter
//        *
//        **
//        ***
//        **
//        *
        for (int i=1 ; i<=no ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=1 ; i<=no ; i++)
        {
            for(int j=no-1 ; j>=i ; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}