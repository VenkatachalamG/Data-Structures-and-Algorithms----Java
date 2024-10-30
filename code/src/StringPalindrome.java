public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Malatyalam";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }

    private static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end){
            if(str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
