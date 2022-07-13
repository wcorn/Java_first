package play;

public class GenericMethod {
	public static <T,V> double MakeRectangle()
	{
		Generic p1 = new Generic<Double, Integer>(0.0,0);
		Generic p2 = new Generic<Double, Integer>(100.0,10);
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		return (left-right)*(top-bottom);
	}
	public static void main(String[] args) {
		System.out.println(MakeRectangle());
	}

}
