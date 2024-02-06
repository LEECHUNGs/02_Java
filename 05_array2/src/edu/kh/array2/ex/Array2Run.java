package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Run {
	
	public static void main(String[] args) {
		Array2Example arr2Ex = new Array2Example();
		
		//arr2Ex.ex1();
		//arr2Ex.ex2();
		arr2Ex.ex3();
		
		int[] numbers = {2,1,3,4,1};
		
		int sum = 0;
		for(int i = 1; i<numbers.length; i++)
			sum += i;
		
		int[] answer = new int[sum];
		int[] answer2 = new int[sum];
        
		int count = 0;
		for(int i = 0; i<numbers.length-1; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                answer2[count++] = numbers[i] + numbers[j];
            }
        }
		
		for(int i = 0; i<answer.length; i++) {
			for(int j = 0; j<answer.length; j++) {
				//if()
			}
		}
		
        int temp = 0;
        for(int i = 0; i<answer.length-1; i++) {
            for(int j = i+1; j<answer.length; j++) {
                if(answer[i] > answer[j]) {
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(answer2));
	}
}
//
//0123	1234	j-1/4 i/0 = j - (4 - 0) + 3
//456	234		j+2/3 i/1 = j - (4 - 1) + 3
//78	34		j+4/2 i/2 = j - (4 - 2) + 3
//9		4		j+5/1 i/3 = j - (4 - 3) + 3
//




