package TwoPointers;

/*Фраза является палиндромом , если после преобразования всех прописных букв в строчные и удаления всех не буквенно-цифровых
символов она читается одинаково вперед и назад. Буквенно-цифровые символы включают буквы и цифры.
Если задана строка s, возврат, true если это палиндром , или false иначе .*/

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        if (s.equals(stringBuilder.toString())) {
            return true;
        }
        return false;
    }
}
