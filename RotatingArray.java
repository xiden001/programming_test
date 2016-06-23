/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author SAMUEL ADOGA
 */
public class RotatingArray {
    
    public static void main(String[] args){
    
        int[] testarray = {1,2,3,4,5,6};
        
        int[] rotated_array = rotateBy(testarray, 2);
        
        for(int x : rotated_array){
            System.out.print(" "+x);
        }
        
        
    }
    public static int[] rotateBy(int[] array , int n){
    int[] rotated = {};
    int lastnum = 0;
    
    for(int i = 0; i < n ; i++){
        
        lastnum = array[array.length-1];
        
        for(int j = array.length-1; j >=1 ; j--){
           
            array[j] = array[j-1];
            
    }
        array[0] = lastnum; 
    }
    
    
    
    return array;
    }
}
