package sampleTest;

import java.util.Scanner;

public class Test02 {
	//첫번째 입력이 15일때 
	//두번째 입력이 10일때 값이 바뀌어야함
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println(">>시작값 입력");
		String inputStart = scan.nextLine();	// "15"
		System.out.println(">>끝값 입력");
		String inputEnd = scan.nextLine();	// "10"
		
		try {
			int start = Integer.parseInt(inputStart); //15
			int end = Integer.parseInt(inputEnd); //10
			int sum = 0;
			if(start>end) {
				int temp = end; // temp = 10
				end = start; // end = 15
				start = temp; // start = 10
			}
			for(int i=start; i<=end ; i++) {
				sum +=i;
			}
			System.out.println("합계 : " + sum);
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요");
		}		
	}
}
