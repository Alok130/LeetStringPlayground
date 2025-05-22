package leetcode.strings;

public class LC1945_SumOfDigitOfStringAfterConvert {

    /*public static void main(String[] args) {
        String s = "leetcode";//
        String s0 = "abcd";
        int k0 = 3;
        String s1 = "zbax"; // Convert: "zbax" ➝  (26)(2)(1)(24)
        // Transform #1: 2+6+2+1+2+4 = 17
        // Transform #2: 1+7 = 8
        int k = 2;
        //System.out.println(getLucky(s,k));
        System.out.println(getLucky(s0,k0));

        //System.out.println(getLuckyUsingStringBuilder(s,k));
        System.out.println(getLuckyUsingStringBuilder(s0,k0));
    }*/

    public static int getLucky(String s, int k) {

        String val = "";

        for(char ch : s.toCharArray()){
            val += (int)ch-96;
        }

        while (k > 0){
            int sum = 0;
            for (int i = 0; i < val.length(); i++) {
                sum += val.charAt(i)- '0';
            }
            val = String.valueOf(sum);
            k--;
        }
        return  Integer.parseInt(val);
    }

    public static int getLuckyUsingStringBuilder(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch-'a'+1);
        }

        String sv = new String(sb);
        while(k > 0){
            int sum = 0;

            for(char ch : sv.toCharArray()){
                sum += ch-'0';
            }
            sv = String.valueOf(sum);
            k--;
        }
        return Integer.parseInt(sv);
    }
}
