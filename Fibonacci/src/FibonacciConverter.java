import java.util.Scanner;

public class FibonacciConverter 
{

    static int fib(int n)
    {
        if (n==0||n==1)
            return 0;
      else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}

