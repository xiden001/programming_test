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
public class LeastCommonMultiple {
   // static int start = 0;
    
    public static void main(String[] arfs){
    
        int[] testdenominators = {2,24,6,8,4};
        
        int[] testdenominators2 = {2,19};
        
        System.out.println("The LCM for the given array is : "+LCM(testdenominators,testdenominators.length,0));
        //start = 0;
        System.out.println("The LCM for the second given array is : "+LCM(testdenominators2,testdenominators2.length,0));
        
    }
    
    
    
    public static int LCM(int[] numbers, int size, int start){
    
        if(size == 1)
            return numbers[start];
        
        int temp = lcmfind(numbers[start], numbers[start+1]);
        
        numbers[start] = 0;
        numbers[start+1] = temp;
        
        
        return LCM(numbers, size-1,start+1);
    }
    
    public static int lcmfind(int a, int b){
        int temp = a * b;
        int max = max(a,b);
        
        for(int i = max; i <=  temp; i++){
            
            if(i % a == 0 && i % b == 0){
                return i;
            }
        }
       
    return 0;
    }
    
    public static int max(int a, int b){
    
        if(a > b){
        return a;
        }
        return b;
    }
    
    
    
}
