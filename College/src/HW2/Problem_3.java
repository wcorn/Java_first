package HW2;
import java.util.*;
public class Problem_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, color, food, animal;
		System.out.println("Enter name");
		//name color animal food �Է�
		name = sc.nextLine();
		System.out.println("Enter your favorite color");
		color = sc.nextLine();
		System.out.println("Enter your favorite animal");
		animal = sc.nextLine();
		System.out.println("Enter your favorite food");
		food = sc.nextLine();
		String text = "I had a dream that Name ate a Color Animal\nand said it tastedlike Food!";
		// name color animal food �ε��� ��ġ ã�� ����
		int name_index = text.indexOf("Name");
		int color_index = text.indexOf("Color");
		int animal_index = text.indexOf("Animal");
		int food_index = text.indexOf("Food");
		// name color animal food �ε����� ������ ����
		text = text.substring(0,name_index)+name+
			   text.substring(name_index+4,color_index)+color+
			   text.substring(color_index+5,animal_index)+animal+
			   text.substring(animal_index+6,food_index)+food;
			   text.substring(food_index+4);
	    // ��ȯ �� ����Ʈ
		System.out.println(text);
		sc.close();	
	}
}