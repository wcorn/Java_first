package generic;

public class Genric<T, R extends arrd> {
	private T x;
	private R y;
	public Genric(T x, R y)
	{
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public R getY() {
		return y;
	}
	public void setY(R y) {
		this.y = y;
	}
}
