
package com.mycompany.problemsolving.array.strings;

import java.util.ArrayList;
import java.util.List;

/*Problem definition. Is Unique:
 
* Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
  cannot use additional data structures? 
*/

public class isUniqeString {
    
    public boolean isUnique(String str){
        
   
        for(int i =0 ; i<str.length() ; ++i){
            
            for(int j =i+1 ; j<str.length() ;j++){
                
                if(str.charAt(i) == str.charAt(j)){
                    return false ;
                }
            }
        }
        
        
        
        return true ;
    }
    
    
    // in this soultion we define extra space as o(n) 
    
    public boolean isUnique2(String str){
        
     List<Character> list = new ArrayList<>() ;   
     
     for(int i=0 ; i<str.length() ;++i){
         
         if(list.contains(str.charAt(i))){
             list.add(str.charAt(i)) ;
         }else{
             return false ;
         }
     }
      
     return true ;
    }
    
    
    // in this solutino we can consider that we dont define an extra space becuase we space complexity is o(1)
    
    
    public boolean isUnique3(String str){
        
        //initial condition        
        if(str.length()>128){
            return false ;
        }
        if(str.length()<=1){
            return true ;
        }
        int[] freq = new int[128] ;
        
        for(int i=0 ; i<str.length() ; i++){
            
            if(freq[str.charAt(i)]>0){
                return false ;
            }else{
                freq[str.charAt(i)]++ ;
            }
            
            
        }
        
        
        return true ;
    }
    
    
}
