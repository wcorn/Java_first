package class10;

public class test {
	public static void main(String[] args)
	{
		Employee K = new Employee();
		K.setDepartment("�̼���");
		
		System.out.println(Employee.getSerialNum());
		Employee L = new Employee();
		L.setDepartment("������");
		System.out.println(K.getId());
		System.out.println(L.getId());
	}
}
