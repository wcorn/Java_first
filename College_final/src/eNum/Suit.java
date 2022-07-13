package eNum;

public enum Suit {
	Clubs(1,"play"), Diamond(2, "big"), Hearts(3,"aa"), Spade(4,"cc");
	private final int num;
	private final String str;
	private Suit(int num, String str)
	{
		this.num = num;
		this.str = str;
	}
	public int getNum()
	{
		return num;
	}
	public String getStr()
	{
		return str;
	}
}
