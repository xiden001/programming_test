/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.HashSet;

/**
 *
 * @author SAMUEL ADOGA
 */
public class ArrayCompaction {
    
    public static void main(String[] args){
int[] numbers = {1,2,3,2,3,2,1,2,3,2,3,2,3,3,4,3,3,4,2,2,1,1,1,1,2,3,3,4,4,3,2,2,2,2,2,1,2,3,1,2,4,3,1,2,4,3,1};

int[] transformed_numbers =  arrayCompact(numbers);

  for(int num : transformed_numbers){
      System.out.print(num+"");
}

}
    
    public static int[] arrayCompact(int[] oldarray){
    //First we create a Hash set
        HashSet set = new HashSet();
        
        for(int x : oldarray){
           set.add(x);
        }
        Object[] ss = set.toArray();
        int[] newarray = new int[ss.length];
        
        for(int i=0;i<ss.length;i++ ){
        newarray[i] = ((Integer) ss[i]);
        }
        
    return newarray;
    }


}