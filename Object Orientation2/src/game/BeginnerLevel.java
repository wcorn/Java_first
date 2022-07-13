package game;

public class BeginnerLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("ddㅇㅇ");
	}

	@Override
	void jump() {
		System.out.println("don't jump");
	}

	@Override
	void turn() {
		System.out.println("dont' run");
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** BeginnerLevel *****");		
	}

}
