package sampleTest;

public class Test08 {
	public static void main(String[] args) {
		Hero hero1 = new Illidan("일리단",3000,240);
		Hero hero2 = new Uther("우서",3500,70);
		
		hero1.move(new Point(10,12)); //일반메소드
		hero1.attack(); //일반메소드
		hero1.userSkill(); //추상메소드
		
		System.out.println("------------------");
		
		hero2.move(new Point(50,10)); //일반메소드
		hero2.attack(); //일반메소드
		hero2.userSkill(); //추상메소드
	}
}
