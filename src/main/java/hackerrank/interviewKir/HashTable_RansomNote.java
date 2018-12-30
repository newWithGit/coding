package hackerrank.interviewKir;

import java.util.HashMap;
import java.util.Map;

public class HashTable_RansomNote {
    public static void main(String[] args) {
        String[] myArr = "two times three is not four".split("\\s");
        String[] note = "two times two is four".split("\\s");

        checkMagazine(myArr, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> freqMap = new HashMap<>(magazine.length);
        for (String str : magazine) {
            if (freqMap.containsKey(str))
                freqMap.put(str, freqMap.get(str) + 1);
            else
                freqMap.put(str, 1);
        }
        String outPut = "Yes";
        for (String str : note) {
            if (freqMap.containsKey(str)) {
                int freq = freqMap.get(str);
                if (freq > 1)
                    freqMap.put(str, freq - 1);
                else freqMap.remove(str);
            } else {
                outPut = "No";
                break;
            }
        }
        System.out.println(outPut);
    }
}
