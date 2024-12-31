public class _3 {
    public static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        return f(n - 1) + f(n - 1);
    }
}











/*
int f(int n){
    if (n <= 1){
        return 1;
    }
    return f(n - 1) + f(n - 1);
}

Normal Code ☝️
Actually hava to write like ☝️☝️☝️
*/