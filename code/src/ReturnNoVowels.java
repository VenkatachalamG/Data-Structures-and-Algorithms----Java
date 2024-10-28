public class ReturnNoVowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String ans = vowelsRemoved(str, str.length());
        System.out.println(ans);
    }

    private static String vowelsRemoved(String str, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
