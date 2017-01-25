import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println ("Введите n-ое число Фибоначчи ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.print(" не определено\n");
            } else if (n < 2) {
                System.out.print(" = " + n);
            } else {
                long f1 = 0;
                long fib = 1;
                long f2;
                long temp = n;
                while (--temp > 0) {
                    f2  = fib;
                    fib += f1;
                    System.out.println("f1 = " + f1 +  ", f2 = " + f2 + ", fib = " + fib );
                    f1  = f2;
                }
                System.out.print( n+ " е число Фибоначчи = " + fib);
            }

    }
}
