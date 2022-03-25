package HW2;
import java.util.*;
public class Problem_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, color, food, animal;
		System.out.println("Enter name");
		//name color animal food 입력
		name = sc.nextLine();
		System.out.println("Enter your favorite color");
		color = sc.nextLine();
		System.out.println("Enter your favorite animal");
		animal = sc.nextLine();
		System.out.println("Enter your favorite food");
		food = sc.nextLine();
		String text = "I had a dream that Name ate a Color Animal\nand said it tastedlike Food!";
		// name color animal food 인덱스 위치 찾고 저장
		int name_index = text.indexOf("Name");
		int color_index = text.indexOf("Color");
		int animal_index = text.indexOf("Animal");
		int food_index = text.indexOf("Food");
		// name color animal food 인덱스에 삽입후 저장
		text = text.substring(0,name_index)+name+
			   text.substring(name_index+4,color_index)+color+
			   text.substring(color_index+5,animal_index)+animal+
			   text.substring(animal_index+6,food_index)+food;
			   text.substring(food_index+4);
	    // 변환 후 프린트
		System.out.println(text);
		sc.close();	
	}
}