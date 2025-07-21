
package com.mycompany.problemsolving.array.strings;

/*Problem: Reverse Words in a String
Defenition:

4. Reverse Words in a String
Difficulty: Medium
Topic: String Splitting, In-place

Problem: Given an input string s, reverse the order of the words.

Example:

text
Copy
Edit
Input: "the sky is blue"
Output: "blue is sky the"

*/

public class ReverseWordsInStrint {
    
    
    
    public String reverse(String s){
     
     String[] words = s.split(" ") ;
     int l = words.length -1 ;
     String rev = "";
     for(int i= l ; i>=0 ; --i){
         
       rev = rev+words[i]+" " ;  
     }
     return rev ;
    }
}
