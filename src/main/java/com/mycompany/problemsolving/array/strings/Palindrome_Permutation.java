
package com.mycompany.problemsolving.array.strings;

import java.util.HashMap;
import java.util.Map;

/*Problem:Palindrome_Permutation
Def:
You are given a string of characters (it can have letters and spaces).
Your task is to check if the letters in the string can be rearranged to form a palindrome.

A palindrome is a word that reads the same forward and backward.
A permutation means changing the order of letters.

The string doesn't need to be a real word — just check if it’s possible to rearrange it into a palindrome.

*/

public class Palindrome_Permutation {
    
    
    public boolean isPermutationPalindrom(String str){
      
        str = str.toLowerCase();
        Map<Character , Integer> map = new HashMap<>();
        
       for(char x : str.toCharArray() ){
           
        
        if(map.containsKey(x) && x != ' '){
            map.put(x,map.get(x)+1) ;
        }else{
            if(x != ' '){
                map.put(x, 1) ;
            }
        }
           
       } 
       
       int count =0 ;
       
      for(char x : map.keySet()){
          
          if(map.get(x)%2 != 0 ){
              count ++ ;
          }
      }
      
      if(count > 1){
          return  false ;
      }
 
        
        
        return true ;
    }
    
    
    
    
}
