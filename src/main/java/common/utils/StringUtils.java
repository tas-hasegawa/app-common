package common.utils;

public final class StringUtils {

    private StringUtils() {}

    /**
     * String#format()のシンタックスシュガーです。
     * argsがNULLの場合は空文字が返却されます。
     *
     * @param format フォーマット文字列
     * @param args 置換文字列
     * @return フォーマット結果の文字列
     */
    public static String fmt(String format, Object... args) {
        if (args == null) {
            return "";
        }
        return String.format(format, args);
    }
}
