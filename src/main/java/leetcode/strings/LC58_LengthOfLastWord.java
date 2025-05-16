package leetcode.strings;

public class LC58_LengthOfLastWord {

    // Optimized Solution (RECOMMENDED)
    public static int lengthOfLastWordOptimized(String s) {
        s = s.trim();
        int lastIndexOfSpace = s.lastIndexOf(" ");

        return s.length()-1 -lastIndexOfSpace;
    }

   // BRUTE Force Solution of LengthOfLastWord.
    public static int lengthOfLastWord(String s) {
        String updatedString = s.trim();

        if(updatedString.length() == 1){
            return  1;
        }

        if(!updatedString.contains(" ")){
            return updatedString.length();
        }

        int indexValue = 0;
        int temp_Value = 0;
        int lengthOfString = updatedString.length();
        int lastWordCounter = 0;

        for( char ch : updatedString.toCharArray()){
            if(ch == ' '){
                updatedString.charAt(indexValue);
                temp_Value = indexValue;
            }
            indexValue++;
        }
        int lastWordInitialIndexValue = temp_Value+1;

        for (int i = lastWordInitialIndexValue; i <lengthOfString; i++) {
            lastWordCounter++;
        }
        return lastWordCounter;
    }
}
