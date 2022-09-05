package sampleTest;

public class Uther extends Hero {

	public Uther(String name, int hp, int attack) {
		super(name, hp, attack);
	}

	@Override
	public void userSkill() {
		System.out.println(name + " : 특수기술 사용 - 천상의 보호막");		
	}

}
