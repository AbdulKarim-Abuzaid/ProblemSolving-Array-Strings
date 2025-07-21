
package com.mycompany.problemsolving.array.strings;

import java.util.Arrays;
import java.util.HashMap;

/*Problem: Anagram Checker
An anagram is a word or phrase that is formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

🎯 Goal:
You are given two strings s and t.
You need to check: Is t an anagram of s?

📥 Example 1:
text
Copy
Edit
Input:  s = "listen", t = "silent"
Output: true  ✅
Explanation: Both strings have the same letters just in different order.
📥 Example 2:
text
Copy
Edit
Input: s = "hello", t = "bello"
Output: false ❌
Explanation: Different letters (no 'b' in "hello")
*/

public class AnagramChecker {
    
    
    public boolean checker(String s1 , String s2){
        
     if(s1.length() != s2.length()){
         return false ;
     }
     
     char[] charS1 = s1.toCharArray();
     char[] charS2 = s2.toCharArray();
     
     Arrays.sort(charS1);
     Arrays.sort(charS2);
        
        return Arrays.equals(charS1, charS2);
    }
    
    
//   Solve the problem using Hash 
    
    public boolean checker2(String s1 ,String s2 ){
        
      if(s2.length() != s1.length()){
          return false ;
      }  
      
      int[] freq = new int[26] ; // from a-z 
      
      for(int i =0 ;i<s1.length() ;++ i){
          freq[s1.charAt(i) - 'a']++ ;
          freq[s2.charAt(i) -'a']-- ;
      }
      
      for(int count: freq){
          if(count != 0){
              return false ;
          }
      }
      return false ;
    }


public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        s = s.toLowerCase();
        t = t.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }
}