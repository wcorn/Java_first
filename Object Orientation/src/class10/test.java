package class10;

public class test {
	public static void main(String[] args)
	{
		Employee K = new Employee();
		K.setDepartment("이순신");
		
		System.out.println(Employee.getSerialNum());
		Employee L = new Employee();
		L.setDepartment("김유신");
		System.out.println(K.getId());
		System.out.println(L.getId());
	}
}
