package src.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Перебираем строку справа налево
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            // Если текущее число меньше предыдущего, вычитаем его
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // Вывод: 3
        System.out.println(romanToInt("LVIII"));     // Вывод: 58
        System.out.println(romanToInt("MCMXCIV"));   // Вывод: 1994
    }
}
