package play;
import java.util.*;
public class ArrayList_demo {

	public static void main(String[] args) {
		ArrayList<Integer> iu = new ArrayList<Integer>();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		iu.add(arr[1]);
		iu.remove(1);
		iu.clear();
		ArrayList<Integer> song = (ArrayList<Integer>)iu.clone();
	}

}
