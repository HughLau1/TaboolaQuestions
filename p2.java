public class p2 {
    public static boolean contains_num(String s) {

        

        for (int i = 0; i < s.length(); i++) {
            int x  = (int) s.charAt(i); 
            if (x >= 48 && x <= 57) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String x = "hi1";
        System.out.print(contains_num(x));
    }
}
