public class PangramSentence {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Given sentence is "+str);
        boolean ans = isPangram(str);
        System.out.println("The above sentence is : "+ ans);
    }

    private static boolean isPangram(String str) {
        boolean[] letters = new boolean[26];
        int lettersCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!letters[c - 'a']){
                letters[c - 'a'] = true;
                lettersCount++;
            }
        }
        return lettersCount == 26;
    }
}
