import java.util.Scanner;

public class _3 {
    public static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        return f(n - 1) + f(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Result: " + f(n));

        scanner.close();
    }
}











/*
int f(int n){
    if (n <= 1){
        return 1;
    }
    return f(n - 1) + f(n - 1);
}

Normal Code ^_^
Actually hava to write like ^_^^_^
*/