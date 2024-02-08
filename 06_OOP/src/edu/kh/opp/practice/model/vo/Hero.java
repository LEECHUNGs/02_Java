package edu.kh.opp.practice.model.vo;

public class Hero {

	String nickName;
	String job;
	int hp;
	int mp;
	int level;
	int exp;

	// getter/setter
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void attack(int exp) {
		System.out.println(nickName + "은/는 공격을 했다!");
		this.exp += exp;

		if (this.exp >= 500) {
			System.out.println("레벨이 올랐습니다 !!");
			this.level++;
			System.out.println("레벨 : " + this.level);
		}
	}

	public void magicJump() {

		if (this.mp > 0) {
			System.out.println(nickName + "의 점프!");
			mp -= 10;
		} else {
			System.out.println("더 이상 매직 점프 할 수 없어요!");
		}

	}
}
