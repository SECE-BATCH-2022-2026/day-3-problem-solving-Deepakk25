import java.util.*;
import java.io.*;

class prgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        if (a == 13) {
            sum = 0;            
        } else if (b == 13) {
            sum = a;            
        } else if (c == 13) {
            sum = a + b;       
        } else {
            sum = a + b + c;   
        }

        System.out.println(sum);
    }
}
