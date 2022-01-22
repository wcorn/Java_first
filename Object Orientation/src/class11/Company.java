package class11;

public class Company {
	private static Company instance = new Company();
	private Company() {
		
	}
	public static Company getinstance() {
		if(instance == null) {
			instance = new Company();
		}
			
		return instance;
	}
	
}
