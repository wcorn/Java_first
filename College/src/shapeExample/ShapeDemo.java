package shapeExample;
public class ShapeDemo {
	public static void main(String[] args) {		
		System.out.println("\n\t\tSave the RedWood!");
		TriangleInterface tri = new Triangle(15,21);
		tri.drawHere();
		RectangleInterafce box = new Rectangle(17,4,17);
		box.drawHere();
	}
}