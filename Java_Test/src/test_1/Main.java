package test_1;
public class Main {
	public static void main(String[] args){
		Person E = new Person("Edward",20000);
		Taxi T = new Taxi("�� ���� ����ý�");
		E.takeTaxi(T,10000);
		System.out.println(E.show());
		System.out.println(T.show());
	}
}
