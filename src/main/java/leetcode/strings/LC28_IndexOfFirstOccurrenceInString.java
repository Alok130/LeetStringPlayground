package leetcode.strings;

public class LC28_IndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
//        String haystack = "sadbutsad";
//        String needle = "sad";
        /*String haystack = "leetcode";
        String needle = "leeto";*/
        String haystack = "a";
        String needle = "a";
        System.out.println("Value : "+strStr(haystack, needle));
        System.out.println("Value : "+strStrSecMethod(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        if(!(haystack.length() >= needle.length())){
            return -1;
        }

        int indexValue = haystack.indexOf(needle);
        if(indexValue >= 0){
            return indexValue;
        }
        return -1;
    }

    public static int strStrSecMethod(String haystack, String needle){
        int i;
         for (i=0; i <= haystack.length()-needle.length(); i++){
             if(haystack.substring(i, i+needle.length()).equals(needle)){
                 return i;
             }
         }
        return -1;
    }
}
