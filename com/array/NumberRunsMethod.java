package com.array;

import java.util.Random;
public class NumberRunsMethod {
    public static int consecutive(int[] array,int position){
        int count=0;

            while (position<array.length-1&&array[position]==array[position+1]){
                count++;
                position++;
            }
        return count;
    }
    public static int numRuns(int[] array,int length){
        int i=0;
        int count=0;
        int leng;
        while (i<array.length-1){
            leng=consecutive(array,i);
            if(leng==length)count++;
            i+=leng;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array={0,0,0,1,2,3,4,0,5,5,5,1,1,1,1,1,2,5,0,0,0,5,5,7,8,9,10,4,4,4};
//        Random random=new Random();
//        for(int i=0;i< array.length;i++)array[i]=random.nextInt(15);
        for(int i:array) System.out.print(i+"  ");
        System.out.println("\nThere are "+numRuns(array,3)+" runs of length 3");
    }
}
