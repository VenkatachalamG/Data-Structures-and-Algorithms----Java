import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listeen", str2 = "silent";
        boolean ans = checkAnagram(str1, str2);
        System.out.println(ans);
    }

    private static boolean checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
