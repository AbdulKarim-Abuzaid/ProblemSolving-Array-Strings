/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemsolving.array.strings;

/**
 *
 * @author abdal
 */
public class ProblemSolvingArrayStrings {

    public static void main(String[] args) {
        
     RotateArray obj = new RotateArray() ;
     
     int[] nums = {1,2,3,4,5,6,7} ;
     obj.rotateArray(nums, 4);
     for(int i=0 ; i< nums.length ; i++ ){
         System.out.println(nums[i]) ;
     }
       
    }
}
