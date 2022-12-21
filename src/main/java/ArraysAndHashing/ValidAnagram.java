package ArraysAndHashing;

import java.util.Arrays;

/*Даны две строки s и t, вернуть true, если t это анаграмма s, и false в противном случае .
Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы, обычно с использованием всех исходных букв ровно один раз.*/

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    //Runtime 2 ms, Memory 42.8 MB
    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            String newS = new String(s1);
            String newT = new String(t1);
            if (newS.contains(newT)) {
                return true;
            }
        }
        return false;
    }
}
