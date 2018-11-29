package com.company;
import java.util.Random;

public class ranClass {
    private Random ranNum = new Random();
    public int[] numbers = new int[100]; //Subject to change
    public boolean[] duplicates = new boolean[numbers.length]; //This allows for duplicates to be stored

    public ranClass(){
        generateRanNum();
        detectDuplicate();
    }

    public void generateRanNum(){
        int count = -1;

        while(count < numbers.length - 1){
            count++;
            numbers[count] = ranNum.nextInt(100) + 1;
            System.out.println(numbers[count]);
        }
        //For duplicate numbers
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                //The variable j will always check one number ahead
                if(numbers[i] == numbers[j]){
                    numbers[j] += ranNum.nextInt();
                }
            }

        }
    }

    public void detectDuplicate(){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    duplicates[i] = true;
                    for(boolean d: duplicates){
                        System.out.println(d);
                    }
                }
            }
        }
    }
}

