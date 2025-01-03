public class reverse_string {
    public static void main(String[] args){
        String str = "Ukasha";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reverse);
    }
}
