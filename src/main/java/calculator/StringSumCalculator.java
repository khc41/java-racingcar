package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSumCalculator {

    public static final String DEFAULT_DELIMITER = "[,:]";
    public static final String CUSTOM_DELIMITER = "//(.)\n(.*)";
    public static final Pattern pattern = Pattern.compile(CUSTOM_DELIMITER);
    public static final int DELIMITER_GROUP = 1;
    public static final int TEXT_GROUP = 2;

    private StringSumCalculator(){

    }

    public static int sum(final String text) {
        if (isBlank(text)) {
            return 0;
        }
        String[] split = getSplit(text);
        int[] numbers = getNumbers(split);
        return sumNumbers(numbers);
    }

    private static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    private static int[] getNumbers(final String[] split) {
        final int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            final int number = getPositiveNumber(split[i]);
            result[i] = number;
        }
        return result;
    }

    private static int getPositiveNumber(final String split) {
        int number;
        try {
            number = Integer.parseInt(split);
        } catch (NumberFormatException e){
            throw new RuntimeException();
        }
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    private static int sumNumbers(final int[] split) {
        int result = 0;
        for (int number : split) {
            result += number;
        }
        return result;
    }

    private static String[] getSplit(final String text) {
        String[] split = text.split(DEFAULT_DELIMITER);
        final Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            final String customDelimiter = matcher.group(DELIMITER_GROUP);
            split = matcher.group(TEXT_GROUP).split(customDelimiter);
        }
        return split;
    }

}
