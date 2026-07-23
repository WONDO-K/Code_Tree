import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        // String result = String.format("%.2f", Math.round(N*100)/100.0);
        // System.out.println(result);
        
        N = Math.round(N*100)/100.0;
        System.out.printf("%.2f", N);
        

    }
}