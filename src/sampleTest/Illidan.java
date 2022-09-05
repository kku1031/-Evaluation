package sampleTest;

public class Illidan extends Hero {

	public Illidan(String name, int hp, int attack) {
		super(name, hp, attack);
	}

	@Override
	public void userSkill() {
		System.out.println(name + " : 특수기술 사용 - 사냥");
	}
}
