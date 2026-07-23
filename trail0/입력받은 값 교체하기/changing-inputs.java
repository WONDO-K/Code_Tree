import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.printf("%d %d", a,b);

        
    }
}