package polymorphism;
public class Animal {
	private String AnimalName;
	public void speak()
	{
	}
	public static void main(String[] args) {
		Animal a[] = new Animal[3];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Duck();
		speakTogether(a);
	}
	private static void speakTogether(Animal[] arr) {
		for(Animal a:arr)
		{
			a.speak();
		}
	}

}
