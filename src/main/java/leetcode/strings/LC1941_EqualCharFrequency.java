package leetcode.strings;

import java.util.Vector;

public class LC1941_EqualCharFrequency {

    public static boolean areOccurrencesEqual(String s) {

        Vector<Integer> vectorCounter = new Vector<>();

        while(!s.isEmpty()){
            int occCounter = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(0) == s.charAt(j)){
                    occCounter++;
                }
            }
            System.out.println("Counter Value :"+occCounter);

            vectorCounter.add(occCounter);

            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            System.out.println("Value : "+s);
        }
        // check if the array contains equal elements or not
        // if yes return "true"
        // else return "no"

        for (int i = 0; i < vectorCounter.size()-1; i++) {
            Integer i1 = vectorCounter.elementAt(i);
            Integer i2 = vectorCounter.elementAt(i+1);
            if (!i1.equals(i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean areOccurrencesEqualOptimized(String s) {

        int [] frequency = new int[26];

        for(char alphabet : s.toCharArray()){
            frequency[alphabet - 'a']++;// frequency[alphabet - 'a'] or freq[index] = freq[index] + 1;
        }

        int commonFreq = 0;

        for(int freq : frequency){
            if(freq == 0){
                continue;
            }
            if(commonFreq == 0){
                commonFreq = freq;
            } else if (freq != commonFreq) {
                return false;
            }
        }
        return true;
    }
}