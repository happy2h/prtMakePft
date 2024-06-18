package top.fx2h.june;

import java.math.BigInteger;

public class J0618 {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            if (isValid(word)) {
                String val = word.substring(1);
                double price = Long.parseLong(val) * (1 - discount / 100.0);
                sb.append(String.format("$%.2f", price));
            } else {
                sb.append(word);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private boolean isValid(String word) {
        return word.matches("\\$\\d+[.*\\d+]*");
    }

}
