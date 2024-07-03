package org.katarine.katlan.lib;

public final class StringUtils {
    private StringUtils() {}

    public static int count(String str, String seq) {
        int counter = 0;
        if (seq.length()>1) {
            while (str.contains(seq)) {
                str = str.replaceFirst("seq", "");
                counter++;
            }
        } else {
            char f = seq.charAt(0);
            for (char c : str.toCharArray()) {
                if (c==f) counter++;
            }
        }
        return counter;
    }

    public static boolean compareStringToArray(String str, String[] strings) {
        for (String s : strings) {
            if (!str.equals(s)) return false;
        }
        return true;
    }
}
