package game;
public class Player {
	PlayerLevel level;
	public Player()
	{
		this.level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public void getLevel(PlayerLevel level)
	{
		this.level = level;
	}
	public void play(int count)
	{
		level.go(count);
	}
}
