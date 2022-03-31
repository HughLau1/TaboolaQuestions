public class p1 {
    public static int convert(String s) {

        int res = 0;

        for (int i = 0; i < s.length(); i++)

            res = ((int) s.charAt(i) - 48) + res * 10;

        // Print the answer
        return res;
    }
    public static void main(String[] args) {
        String x = "109237893";
        System.out.print(convert(x));
    }
}
