package test;

public class Test {
	public static void main(String[] args)
	{
		Person E = new Person("Edward",20000);
		Taxi T = new Taxi("�� ���� ����ý�");
		E.takeTaxi(T,10000);
		
		E.show();
		T.show();
	}
}
