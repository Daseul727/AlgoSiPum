package kds.week1;

import java.util.ArrayList;
import java.util.List;

public class reorderLogFiles {
    public static void main(String[] args) {
        String[] s = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        reorderLogFiles(s);
    }

    public static String[] reorderLogFiles(String[] logs) {
        List<String> str = new ArrayList<>();
        List<String> nums = new ArrayList<>();

        for(String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                nums.add(log);
            } else {
                str.add(log);
            }
        }

        str.sort((s1,s2) -> {
            String[] s1x = s1.split(" ",2);
            String[] s2x = s2.split(" ",2);

            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });

        str.addAll(nums);

        return str.toArray(new String[0]);
    }
}
