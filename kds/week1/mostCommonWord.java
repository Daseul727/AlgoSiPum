package kds.week1;

import java.util.*;

public class mostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        mostCommon(paragraph, banned);
    }

    public static String mostCommon(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        String[] list = paragraph.replaceAll("\\W+"," ").toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            if (!ban.contains(str)) {
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
