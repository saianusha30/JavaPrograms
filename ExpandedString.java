import java.util.*;
public class ExpandedString{
    public static String expandString(String S) {
        StringBuilder result=new StringBuilder();
        int[] firstOccurence = new int[26];

        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            int index=ch-'a';

            if(firstOccurence[index]==0){
                firstOccurence[index]=i+1;
            }
            if(i>0){
                result.append("-");
            }
            int repeatCount=firstOccurence[index];
            for(int j=0;j<repeatCount;j++){
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String input="abcaba";
        String output=expandString(input);
        System.out.println(output);
    }
}