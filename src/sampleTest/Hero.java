package sampleTest;

public abstract class Hero {
	String name;
	int hp;
	int attack;
	
	public Hero(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public void move(Point point) {
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		System.out.println("("+point.getX()+","+point.getY()+")로 이동");
		// (10,12)
	}

	public void attack() {
		//일리단 공격력 : 240
		//우서 공격력 : 70
		System.out.println(name + "공격력 : " + attack);
	}

	public abstract void userSkill(); 	
}
