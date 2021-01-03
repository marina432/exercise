package org.example.util;

/**
 * The type String utils.
 *
 * @author xiaoyu(Myth)
 */
public class StringUtils {


    /**
     * Is none blank boolean.
     *
     * @param css the css
     * @return the boolean
     */
    public static boolean isNoneBlank(final CharSequence... css) {
        return !isAnyBlank(css);
    }

    /**
     * Is any blank boolean.
     *
     * @param css the css
     * @return the boolean
     */
    private static boolean isAnyBlank(final CharSequence... css) {
        if (isEmpty(css)) {
            return true;
        }
        for (CharSequence cs : css) {
            if (isBlank(cs)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Is empty boolean.
     *
     * @param array the array
     * @return the boolean
     */
    public static boolean isEmpty(final Object[] array) {
        return array == null || array.length == 0;
    }

    /**
     * Is blank boolean.
     *
     * @param cs the cs
     * @return the boolean
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

