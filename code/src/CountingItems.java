import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class CountingItems {
    public static void main(String[] args) {
        String str = "apple";
        Hashtable<Character, Integer> count = countOfItems(str, str.length());
        System.out.println(count);
    }

    private static Hashtable<Character, Integer> countOfItems(String str, int length) {
        Hashtable<Character, Integer> count = new Hashtable<>();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            }
            else{
                count.put(c, 1);
            }
        }

        return count;
    }
}
