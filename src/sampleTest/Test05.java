package sampleTest;

public class Test05 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int result1 = cal.add(10,12);
		int result2 = cal.add(10,"12");
		int result3 = cal.add("10",12);
		int result4 = cal.add("10","12");
		
		System.out.println("결과 1 : " + result1);
		System.out.println("결과 2 : " + result2);
		System.out.println("결과 3 : " + result3);
		System.out.println("결과 4 : " + result4);
		
	}
}

//메소드 오버로딩 : 동일한 이름'으로 다양한 매개변수와 다양한 리턴타입의 여러 메소드를 정의하는 것
