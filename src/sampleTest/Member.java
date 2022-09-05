package sampleTest;

public class Member {

	int id;
	String name;
	String password;
	String email;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Member(int id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Member [회원번호=" + id + ", 이름=" + name + "]";
	}


	public boolean confirmPassword(String password) {
		return this.password.equals(password);
	}
}
