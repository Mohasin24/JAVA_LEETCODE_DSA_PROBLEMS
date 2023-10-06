/* 
Problem Statement :
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
*/

import java.lang.*;

public class Maximum_Number_of_Words_Found_in_Sentences 
{
    public static void main(String[] args) 
    {
        String str[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(str));
    }   
    
    public static int mostWordsFound(String[] sentences) 
    {   
        
        int max=0;
        
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
                if(count>max){
                    max=count;
                }
            }
        }

        return max;
    }
}
