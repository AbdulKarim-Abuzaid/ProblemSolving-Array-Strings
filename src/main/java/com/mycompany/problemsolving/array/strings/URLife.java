/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving.array.strings;

/*Problem: URLife
Def:
You will be given an array of characters that represents a string with extra spaces at the end.

Your task is to replace all spaces in the string with '%20', in place (without using extra space if possible).

You will also be given the "true" length of the string (the part of the array that contains actual characters, not the extra spaces at the end).

✅ Example:

Ex1
Input: 
Output: 
"Mr John Smith 
", 13 
"Mr%20John%20Smith"

Ex2
Input:
Character array: ['M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ']
True length: 13

Output:
['M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h']


*/
public class URLife {
    
    
    public void replace(char[] str , int trueLength){
     
        int back = str.length -1 ;
        
     for(int i = trueLength-1 ; i>0 ; i--){
         
         if(str[i] == ' '){
             
           str[back] = '%';
           str[back-1] = '0' ;
           str[back-2] = '2' ;
           back = back - 3 ;
           
         }else{
             str[back] = str[i] ;
             back = back -1 ;
         }
         
     }   
        
        
    }
    
}
