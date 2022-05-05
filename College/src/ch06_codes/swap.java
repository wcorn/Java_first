package ch06_codes;

public class swap {
	public static void main( String args[] ){ 
//	    int n1 = 10, n2 = 20;
//	    swap(n1, n2);
//	    System.out.println(n1+", "+n2);

	    IntHolder n1 = new IntHolder();
	    IntHolder n2 = new IntHolder();
	    n1.value = 10; n2.value =20;
	    swap(n1, n2);
	    System.out.println(n1.value+", "+n2.value);
	
	}
//	private static void swap(int arg1, int arg2) {
//	    int temp = arg1;
//	    arg1 = arg2;
//	    arg2 = temp;
//	}
	
	private static void swap(IntHolder a, IntHolder b) {
	    int temp = a.value;
	    a.value = b.value;
	    b.value = temp;
	}
	
}
