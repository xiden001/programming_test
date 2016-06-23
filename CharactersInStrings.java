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
public class CharactersInStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String test1 = "Duel";
        String test2 = "Jane is lousy";
        //Order N^2 Test
        System.out.println(find_chars(test1, test2));
        
        //Order N Test
        System.out.println(find_chars2(test1, test2));
        
    }
    
    //Order N^2
    public static String find_chars(String str1, String str2){
    String result = "";
        for(int i=0; i < str1.length(); i++){
            String a = str1.charAt(i)+"";
            for(int j=0; j< str2.length(); j++){
                String b = str2.charAt(j)+""; 
                if(a.equalsIgnoreCase(b) ){
                    result += str1.charAt(i);
                }
            }
        }
        
        
        return result;
    }
    
    //Order N
    public static String find_chars2(String str1,String str2){
    String result = "";
    
    for(int i = 0; i < str1.length(); i++){
        String a = str1.charAt(i)+"";
        if(str2.contains(a)){
            result += a;
        }
    }
    return result;
    }
}
