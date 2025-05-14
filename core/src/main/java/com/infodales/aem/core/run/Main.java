package com.infodales.aem.core.run;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums={3,7,8,5,2};
        int target=9;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a = i;
                    b = j;
                    System.out.println (a+","+b);
                    break;
                }
            }
                          
        }
        int[] ans={a,b};
          System.out.println(Arrays.toString(ans));
        
    }
}