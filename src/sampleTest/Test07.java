package sampleTest;

public class Test07 {
	public static void main(String[] args) {
		Member member = new Member(1, "홍길동", "1234", "hong@example.com");
		System.out.println(member);
		
		System.out.println("=========비밀번호 일치 여부 ==========");
		boolean result1 = member.confirmPassword("5421"); //false
		boolean result2 = member.confirmPassword("1234"); //true
		
		System.out.println(result1 ? "비밀번호 일치":"비밀번호 불일치");
		System.out.println(result2 ? "비밀번호 일치":"비밀번호 불일치");
	}
}
