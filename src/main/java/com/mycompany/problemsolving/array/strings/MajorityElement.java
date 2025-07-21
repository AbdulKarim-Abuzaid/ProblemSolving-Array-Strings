/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving.array.strings;

/* Problem_defenition
  Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

*/


public class MajorityElement {
    
  public int majorElement(int[] nums){
        
    int count = 0 ;
    int candidite = 0  ;
    
    for(int x : nums){
        
        if(count == 0 ){
            candidite = x ;
        }
        
        if(x == candidite){
            count++ ;
        }
        else{
            count -- ; 
        }
 
    }
    
    return candidite ;
  }  
    
}
